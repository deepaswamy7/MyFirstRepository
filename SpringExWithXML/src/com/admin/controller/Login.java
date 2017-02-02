package com.admin.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Login {
	
	@RequestMapping(value="loginpage", method=RequestMethod.POST)
	private void login(HttpServletRequest request,HttpServletResponse response){
		String name = request.getParameter("user");
		String password = request.getParameter("pwd");
		
		if(name.equals("admin")&&password.equals("admin")){
			try {
				response.getWriter().write("Login Successful");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else{
			try {
				response.getWriter().write("Login Failed");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	}
	


