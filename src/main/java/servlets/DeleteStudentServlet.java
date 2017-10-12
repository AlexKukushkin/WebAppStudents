package servlets;

import db.dao.StudentDAO;
import pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DeleteStudentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> students = null;

        int idStudent = Integer.valueOf(req.getParameter("delete"));
        try {
           new StudentDAO().deleteByID(idStudent);
        } catch (StudentDAO.StudentDAOException e) {
            e.printStackTrace();
        }
        ((HttpServletResponse)resp).sendRedirect("/webstudents/student");
//        req.getRequestDispatcher("/student.jsp")
//                .forward(req,resp);
    }
}
