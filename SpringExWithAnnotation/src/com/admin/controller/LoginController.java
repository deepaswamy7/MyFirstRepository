package com.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.admin.dao.EmployeeDao;
import com.admin.model.Employee;

@Controller
public class LoginController {

	@Autowired
	EmployeeDao studentdao;
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response){
		String name = request.getParameter("username");
		String pwd = request.getParameter("passwd");
		ModelAndView view = new ModelAndView();
		
		if(name.equals("admin")&&pwd.equals("admin")){
			Employee emp = new Employee();
			emp.setEmpId(1);
			emp.setEmpName("deepa");
			emp.setEmpAddress("india");
			
			studentdao.save(emp);
			
			view.setViewName("display.jsp");
		}
		else{
			view.setViewName("login.jsp");
		}
		return view;
		
	}
}
