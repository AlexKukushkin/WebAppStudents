package controllers;

import db.dao.StudentDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pojo.Student;

import java.util.List;

@Controller
public class StudentController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView showStudentFromForm(){
        ModelAndView modelAndView = new ModelAndView();
        List<Student> students = null;

        try {
            students = new StudentDAO().getAll();
        } catch (StudentDAO.StudentDAOException e) {
            e.printStackTrace();
        }

        modelAndView.setViewName("student");
        modelAndView.addObject("list", students);
        return modelAndView;
    }
}
