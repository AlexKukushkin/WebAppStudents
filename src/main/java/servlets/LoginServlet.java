package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        if ("test".equals(login) && "test".equals(password)){
            req.getSession().setAttribute("isAuth", true);
//            req.getRequestDispatcher("/student").forward(req, resp);
            ((HttpServletResponse)resp).sendRedirect("/webstudents/student");
        }else{
            getServletContext().getRequestDispatcher("/").forward(req, resp);
        }
    }
}
