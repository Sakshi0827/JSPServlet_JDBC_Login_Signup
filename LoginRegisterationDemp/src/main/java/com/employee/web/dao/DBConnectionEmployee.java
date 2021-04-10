package com.employee.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionEmployee {

	public Connection getConnection() {
		String username = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/test";
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("DRIVER LOADED SUCESSFULLY");
			con = DriverManager.getConnection(url, username, password);
			System.out.println("17 line in DBConnection");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
}
