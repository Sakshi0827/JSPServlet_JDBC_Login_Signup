package com.employee.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class DeleteEmployeeDao {

public int deleteEmployee(int deid) {
		
		int status = 0;
		
		try {
			DBConnectionEmployee db = new DBConnectionEmployee();
			Connection con = db.getConnection();
			PreparedStatement ps = con.prepareStatement("DELETE FROM employee WHERE eid = ?;");
			ps.setInt(1, deid);
			status = ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		
	}
}
