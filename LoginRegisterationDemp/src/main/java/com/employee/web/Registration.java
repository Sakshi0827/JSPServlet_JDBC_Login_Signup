package com.employee.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.web.dao.RegistrationDao;
import com.employee.web.model.Employee;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/addEmployee")
public class Registration extends HttpServlet {
	RegistrationDao rd;
	public void init() {
       rd = new RegistrationDao();
    }
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int eid = Integer.parseInt(req.getParameter("eid"));
		String ename = req.getParameter("ename");
		String eemail = req.getParameter("eemail");
		String ephone = req.getParameter("ephone");
		String epass = req.getParameter("epass");
		
		Employee e = new Employee();
		e.setEid(eid);
		e.setEname(ename);
		e.setEemail(eemail);
		e.setEphone(ephone);
		e.setEpass(epass);
		
		try {
            rd.registerEmployee(e);
            res.sendRedirect("success.jsp");
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

		
//		doGet(request, response);
	}

}
