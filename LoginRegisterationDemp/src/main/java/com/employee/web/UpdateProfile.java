package com.employee.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.employee.web.dao.UpdateProfileDao;
import com.employee.web.model.Employee;

/**
 * Servlet implementation class UpdateProfile
 */
public class UpdateProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String uemail = req.getParameter("eemail");
		String uphone = req.getParameter("ephone");
		
		Employee e = (Employee) session.getAttribute("Employee");
		System.out.println(e);
		e.setEemail(uemail);
		e.setEphone(uphone);
		System.out.println(uphone);
		
		UpdateProfileDao ud = new UpdateProfileDao();
		
		try {
			ud.updateProfile(e);
            res.sendRedirect("welcome.jsp");
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
	}

}
