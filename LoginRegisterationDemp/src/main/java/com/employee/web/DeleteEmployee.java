package com.employee.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.web.dao.DeleteEmployeeDao;

/**
 * Servlet implementation class DeleteEmployee
 */
//@WebServlet("/deleteEmp")
public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int deid = Integer.parseInt(request.getParameter("eid"));
		
		DeleteEmployeeDao ded = new DeleteEmployeeDao();
		ded.deleteEmployee(deid);
		response.sendRedirect("EmployeesList");
	}

	

}
