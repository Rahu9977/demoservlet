package com.project.utilImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.project.util.util;

public class utilImpl implements util {

	private Connection con = null;
	
	public Connection getConnection() {
		try
		{
       Class.forName("com.mysql.jdbc.Driver");		
      con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		}
		catch (ClassNotFoundException e) {
			System.out.println(e);
			System.out.println("driver class nai malto !!");
		}
		catch (SQLException e) {
			System.out.println(e);
			System.out.println("connection ma kharabi 6!!");
		}
		return con;
	}

	
	
	
	
}
