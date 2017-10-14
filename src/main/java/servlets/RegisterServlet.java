package servlets;

import services.AuthorizationService;
import services.AuthorizationServiceImpl;
import services.RegistrationService;
import services.RegistrationServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {

    private static RegistrationService registrationService = new RegistrationServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("inputLogin");
        String password = req.getParameter("inputPassword");
        if (registrationService.regUser(login, password)) {
            req.getSession().setAttribute("isSignUp", true);
//            req.getRequestDispatcher("/student").forward(req, resp);
            ((HttpServletResponse)resp).sendRedirect("/webstudents/student");
        } else {
            getServletContext().getRequestDispatcher("/").forward(req, resp);
        }
    }
}
