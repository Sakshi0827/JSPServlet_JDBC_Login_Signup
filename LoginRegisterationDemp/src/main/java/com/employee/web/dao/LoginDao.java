package com.employee.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.employee.web.model.Employee;

public class LoginDao {

	String url = "jdbc:mysql://localhost:3306/test";
	String username = "root";
	String password = "root";
	String sql = "Select * from employee where eid = ? and epass = ?";
	
	Employee e = new Employee();
	
	public boolean check(int eid, String epass) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, eid);
			st.setString(2, epass);
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				e.setEid(rs.getInt("eid"));
				e.setEname(rs.getString("ename"));
				e.setEphone(rs.getString("ephone"));
				e.setEemail(rs.getString("eemail"));
				e.setEpass(rs.getString("epass"));
				return true;
			}
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}
	
	public Employee getEmployeeDetails() {
		return e;
	}
}
