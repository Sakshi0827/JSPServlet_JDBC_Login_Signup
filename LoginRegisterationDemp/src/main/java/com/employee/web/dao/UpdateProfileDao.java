package com.employee.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.employee.web.model.Employee;

public class UpdateProfileDao {

	DBConnectionEmployee db = new DBConnectionEmployee();
	
	public int updateProfile(Employee e) {	
		int result = 0;
		String UPDATE_EMPLOYEE_SQL = "UPDATE employee SET ephone = ?, eemail = ? WHERE eid = ?;";
		try {
			
			Connection con = db.getConnection();
			PreparedStatement st = con.prepareStatement(UPDATE_EMPLOYEE_SQL);
			st.setString(1, e.getEphone());
			st.setString(2, e.getEemail());
			st.setInt(3, e.getEid());
			
			result= st.executeUpdate();
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return result;
		
	}
}
