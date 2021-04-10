package com.employee.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.employee.web.model.Employee;

public class RegistrationDao {

	DBConnectionEmployee db = new DBConnectionEmployee();
	
//	Exception e1 = null;
	public int registerEmployee(Employee e) throws Exception {	
		int result = 0;
		String INSERT_EMPLOYEE_SQL = "INSERT INTO employee" +
	            "  (eid, ename, eemail, ephone, epass) VALUES " +
	            " (?, ?, ?, ?, ?);";
		try {
			
			Connection con = db.getConnection();
			PreparedStatement st = con.prepareStatement(INSERT_EMPLOYEE_SQL);
			st.setInt(1, e.getEid());
			st.setString(2, e.getEname());
			st.setString(3, e.getEemail());
			st.setString(4, e.getEphone());
			st.setString(5, e.getEpass());
			
			result= st.executeUpdate();
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
//			e1.printStackTrace();
			throw e1;
		}
		
		return result;
		
	}
}
