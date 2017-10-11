package servlets;

import db.dao.StudentDAO;
import pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class StudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding ("Cp1251");
        resp.getWriter().println("список студентов");
        StudentDAO studentDAO = new StudentDAO();
        try {
            resp.getWriter().println(studentDAO.getAll());
        } catch (StudentDAO.StudentDAOException e) {
            e.printStackTrace();
        }
        resp.getWriter().println("Hello!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> students = null;
        try {
            students = new StudentDAO().getAll();
        } catch (StudentDAO.StudentDAOException e) {
            e.printStackTrace();
        }
        req.setAttribute("list", students);
        req.getRequestDispatcher("/students.jsp").forward(req, resp);
    }
}
