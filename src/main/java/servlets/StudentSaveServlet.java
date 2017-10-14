package servlets;

import db.dao.StudentDAO;
import pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentSaveServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        StudentDAO studentDAO = new StudentDAO();
        try {
            studentDAO.update(new Student(Integer.valueOf(req.getParameter("id_student")), req.getParameter("first_name"),
                    req.getParameter("second_name"), req.getParameter("family_name"),
                    req.getParameter("birthday"), Integer.valueOf(req.getParameter("group_id"))));
        } catch (StudentDAO.StudentDAOException e) {
            e.printStackTrace();
        }
        resp.sendRedirect(String.format("/webstudents/student"));
    }
}
