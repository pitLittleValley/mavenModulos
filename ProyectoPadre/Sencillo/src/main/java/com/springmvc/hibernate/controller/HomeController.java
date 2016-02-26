package com.springmvc.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.hibernate.core.entity.Student;
import com.springmvc.hibernate.core.service.StudentService;

@Controller
public class HomeController {

	@Autowired
	StudentService studentService;
	
//	@RequestMapping(value="/")
//	public ModelAndView test(HttpServletResponse response) throws IOException{
//		return new ModelAndView("home");
//	}
	

	@RequestMapping(value={"/", "/list"})
	public ModelAndView getStudent(ModelMap model){
		List<Student> students = studentService.getStudentsByFinder();
		model.addAttribute("student", students);
		return new ModelAndView("home");
 	}
	
	@RequestMapping(value="/new")
	public ModelAndView newStudent(ModelMap model){
		Student student = new Student();
		model.addAttribute("student", student);
		return new ModelAndView("newStudent");
 	}
}
