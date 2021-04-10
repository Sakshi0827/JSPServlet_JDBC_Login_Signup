package com.employee.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.employee.web.dao.UpdateEmployeeDao;
import com.employee.web.model.Employee;


public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String eemail = request.getParameter("eeemail");
		String ephone = request.getParameter("eephone");
		int eeid = (Integer) session.getAttribute("eeid");
		
		UpdateEmployeeDao ued = new UpdateEmployeeDao();
		Employee e = new Employee();
		System.out.println(e);
		e.setEemail(eemail);
		e.setEphone(ephone);
		e.setEid(eeid);
		
		System.out.println(ephone);
		
		
		try {
			ued.updateEmployee(e);
            response.sendRedirect("EmployeesList");
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
	}

}
