package com.employee.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.web.dao.EmployeesListDao;
import com.employee.web.model.Employee;
/**
 * Servlet implementation class EmployeesList
 */
public class EmployeesList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int page = 1;
		 int recordsPerPage = 5;
		 if(request.getParameter("page")!=null) {
			 page = Integer.parseInt(request.getParameter("page"));
		 }
		 System.out.println("page" + page);
		 EmployeesListDao dao = new EmployeesListDao();
		 List<Employee> list = dao.getRecords((page-1)*recordsPerPage,recordsPerPage);
		 // Getting total no of Records present in Employee Table
		 int noOfRecords = dao.getNoOfRecords();
		 // Getting total no of pages required for Records
		 int noOfPages = (int) Math.ceil(noOfRecords*1.0/recordsPerPage);
		 
		 System.out.println("no of records" + noOfRecords);
		 System.out.println("LIST--- " + list+ "NO OF PAGES---"+ noOfPages+"PAGE--"+ page);
		 
		 for(Employee i: list) {
			 System.out.println(i.getEname());
		 }
		 request.setAttribute("employeesList", list);
		 request.setAttribute("noOfPages", noOfPages);
		 request.setAttribute("currentPage", page);
		 RequestDispatcher view = request.getRequestDispatcher("displayEmployees.jsp");
		 view.forward(request, response);
	}

	

}
