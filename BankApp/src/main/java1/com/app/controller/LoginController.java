package com.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {

	@RequestMapping(value="/login", method=RequestMethod.GET)
	private String login(HttpServletRequest req, HttpServletResponse resp) {
		
             	return "login";
	}
	
	@RequestMapping(value="/signIn", method=RequestMethod.POST)
	private String signIn(HttpServletRequest req, HttpServletResponse resp) {
		String name = req.getParameter("name");
		String pwd = req.getParameter("password");
		
		
		if(name.equals("admin")&&pwd.equals("admin")){
     	return "app/Success";
		}
		return "app/Fail";
}

	
	@RequestMapping(value="/signUp", method=RequestMethod.POST)
	private String signUp(HttpServletRequest req, HttpServletResponse resp) {
		
     	return "SignUp";
}

}
