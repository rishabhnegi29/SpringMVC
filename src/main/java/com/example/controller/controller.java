package com.example.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bean.student;

@Controller
public class controller {

	@RequestMapping("/UserForm")
	public String indexRedirect() {

		return "UserForm";
	}

	@RequestMapping("/hello")
	public String redirect(HttpServletRequest req, Model model) {
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		System.out.println(name + " " + pass);
		model.addAttribute("message", name);
		return "hello";
	}

	@RequestMapping("/helloagain")
	public String display() {
		return "hello";
	}

	@RequestMapping("/")
	public String showForm(Model model) {
		// create a student object
		student student = new student();
		model.addAttribute("student", student);
		// add student object to the model
		return "form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") student student,BindingResult bindingResult) {
		System.out.println("name "+student.getFirstName()+"lastname "+student.getLastName());
		if(bindingResult.hasErrors()) {
			return "form";
		}else {
		return "hello";
		}
	}

	

}
