package com.employemanage.DBCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	
		public static Connection DbCon() throws SQLException {
			Connection con= null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				 String url = "jdbc:mysql://localhost:3306/employe_management";
		            String user = "root";
		            String pass = "Amitkumar@789";
		            con = DriverManager.getConnection(url,user,pass);
			
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return con;
		}

}
