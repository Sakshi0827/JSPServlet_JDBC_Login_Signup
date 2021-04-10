package com.employee.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.employee.web.dao.GetEmployeeDetailDao;
import com.employee.web.model.Employee;


/**
 * Servlet implementation class EditEmployee
 */
public class EditEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		GetEmployeeDetailDao ged = new GetEmployeeDetailDao();
		int eeid = Integer.parseInt(request.getParameter("eid"));
		Employee e = ged.getEmployee(eeid);
		System.out.println("----Hey THERE--" + e.getEid());
		session.setAttribute("eeid", eeid);
		session.setAttribute("editE", e);
		response.sendRedirect("editEmployeeForm.jsp");
	}

	
}
