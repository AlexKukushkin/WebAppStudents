package controllers;

import db.dao.StudentDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeleteStudentController {

    @RequestMapping(name = "/deleteById", method = RequestMethod.GET)
    public String deleteStudent(@RequestParam(name = "delete") int idStudent) {
//        int idStudent = Integer.valueOf(request.getParameter("delete"));
        System.out.println("call");
        try {
            new StudentDAO().deleteByID(idStudent);
        } catch (StudentDAO.StudentDAOException e) {
            e.printStackTrace();
        }
        return "redirect:/student";
    }

    @RequestMapping(name = "/deleteById", method = RequestMethod.GET)
    public String deleteStudent1() {
//        int idStudent = Integer.valueOf(request.getParameter("delete"));
        System.out.println("call    1");
//        try {
//            new StudentDAO().deleteByID(idStudent);
//        } catch (StudentDAO.StudentDAOException e) {
//            e.printStackTrace();
//        }
        return "redirect:/student";
    }
}
