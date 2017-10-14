package servlets;

import db.dao.StudentDAO;
import pojo.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentEditServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        StudentDAO studentDAO = new StudentDAO();
//        try {
//            Student student = studentDAO.getByID(Integer.valueOf(req.getParameter("edit")));
//            req.setAttribute("student", student);
//        } catch (StudentDAO.StudentDAOException e) {
//            e.printStackTrace();
//        }
//        RequestDispatcher dispatcher = req.getRequestDispatcher("/edit_student.jsp");
//        dispatcher.forward(req, resp);
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentDAO studentDAO = new StudentDAO();
        try {
            Student student = studentDAO.getByID(Integer.valueOf(req.getParameter("edit")));
            req.setAttribute("student", student);
        } catch (StudentDAO.StudentDAOException e) {
            e.printStackTrace();
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/edit_student.jsp");
        dispatcher.forward(req, resp);
    }
}
