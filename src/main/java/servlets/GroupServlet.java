package servlets;

import db.dao.GroupDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GroupServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding ("Cp1251");
        resp.getWriter().println("список групп");
        GroupDAO groupDAO = new GroupDAO();
        try {
            resp.getWriter().println(groupDAO.getAll());
        } catch (GroupDAO.GroupDAOException e) {
            e.printStackTrace();
        }
    }
}
