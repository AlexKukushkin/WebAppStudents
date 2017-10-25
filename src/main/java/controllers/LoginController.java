package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import services.AuthorizationService;
import services.AuthorizationServiceImpl;

import javax.servlet.http.HttpServletRequest;


@Controller
public class LoginController {
    private static AuthorizationService authorizationService = new AuthorizationServiceImpl();

    @RequestMapping(value = "/auth", method = RequestMethod.POST)
    public String showStudentFromForm(HttpServletRequest req){
        String login = req.getParameter("inputLogin");
        String password = req.getParameter("inputPassword");
        //return "redirect:/student";
        if (authorizationService.auth(login, password)) {
            req.getSession().setAttribute("isAuth", true);
//            req.getRequestDispatcher("/student").forward(req, resp);
            return "redirect:/student";
        }else{
//            getServletContext().getRequestDispatcher("/").forward(req, resp);
            return "forward:/";
        }
    }
}
