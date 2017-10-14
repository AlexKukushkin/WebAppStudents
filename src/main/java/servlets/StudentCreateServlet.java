package servlets;

import db.dao.StudentDAO;
import pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

public class StudentCreateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        StudentDAO studentDAO = new StudentDAO();
        req.setCharacterEncoding("cp1251");
        resp.setCharacterEncoding("cp1251");
        try {
            studentDAO.insertOne(new Student(Integer.valueOf(req.getParameter("id")), req.getParameter("firstName"),
                    req.getParameter("secondName"), req.getParameter("familyName"),
                    req.getParameter("birthDay"), Integer.valueOf(req.getParameter("group_id"))));
        } catch (StudentDAO.StudentDAOException e) {
            e.printStackTrace();
        }
        resp.sendRedirect(String.format(req.getContextPath(), "/students"));
    }
}
