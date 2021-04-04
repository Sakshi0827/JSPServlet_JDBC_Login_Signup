package com.employee.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.employee.web.dao.LoginDao;
import com.employee.web.model.Employee;

@WebServlet("/getEmployee")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		Employee e;
		int eid= Integer.parseInt(req.getParameter("eid"));
		   String epass = req.getParameter("epass");
		   
		   LoginDao ld = new LoginDao();
		   
		   if(ld.check(eid, epass)) {
			   e = ld.getEmployeeDetails();
			   HttpSession session = req.getSession();
			   session.setAttribute("eid", eid);
			   session.setAttribute("Employee", e);
			   res.sendRedirect("welcome.jsp");
		   }
		   
		   else {
			   res.sendRedirect("login.jsp");
		   }
	}

}
