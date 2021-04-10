package com.employee.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.employee.web.model.Employee;

public class EmployeesListDao {

	int noOfRecords;
	DBConnectionEmployee db = new DBConnectionEmployee();
	public List<Employee> getRecords(int start,int total){  
        List<Employee> list=new ArrayList<Employee>();  
        try{  
  
			Connection con = db.getConnection();
			System.out.println("68 line------" + start +", --" + total);
			PreparedStatement ps=con.prepareStatement("select * from employee limit "+start+","+total);  
            ResultSet rs=ps.executeQuery();  
			System.out.println("70 line------");
			while(rs.next()){  
				Employee e=new Employee();  
                e.setEid(rs.getInt(1));  
                e.setEname(rs.getString(2));  
                e.setEemail(rs.getString(3));
                e.setEphone(rs.getString(4));
                list.add(e);  
            }  
            rs.close();
            con.close();  
        }catch(Exception e){System.out.println(e);}  
        return list;  
    }  
      
      public int getNoOfRecords() {
    	  try {
	    	    
				Connection con = db.getConnection();
				PreparedStatement ps=con.prepareStatement("select * from employee");  
				ResultSet rs=ps.executeQuery();  
		        rs = ps.executeQuery("select FOUND_ROWS()");
		        if(rs.next()){  
		        	this.noOfRecords = rs.getInt(1);
		        }  
	          con.close();  
    	  }
    	 catch(Exception e){System.out.println(e);}    
    	  return noOfRecords;
      }
	
}
