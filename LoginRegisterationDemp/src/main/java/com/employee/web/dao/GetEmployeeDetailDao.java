package com.employee.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.employee.web.model.Employee;



public class GetEmployeeDetailDao {

DBConnectionEmployee db = new DBConnectionEmployee();
	
	public Employee getEmployee(int eid) {
		Employee e = new Employee();
		
		try {
			Connection con = db.getConnection();
			PreparedStatement st = con.prepareStatement("SELECT * from employee where eid = ?");
			st.setInt(1, eid);
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				e.setEid(rs.getInt("eid"));
				e.setEname(rs.getString("ename"));
				e.setEemail(rs.getString("eemail"));
				e.setEphone(rs.getString("ephone"));
				e.setEpass(rs.getString("epass"));
				return e;
			}
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			return null;
		}
}
