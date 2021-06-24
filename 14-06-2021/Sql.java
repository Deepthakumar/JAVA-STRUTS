package com.project3;

import java.sql.*;

public abstract class Sql {
	private static Connection connection;
	   static {

		   
		   
				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				
					connection = DriverManager.getConnection("jdbc:sqlserver://den1.mssql7.gear.host;databaseName=databasesqlsamp",
							"databasesqlsamp","mssqldb@123");
					
					
					System.out.println("Connection established");
				} catch (SQLException e) {
					// TODO Auto-generated c
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

}
	   public static  Connection getConnection() {
		   return connection;
	   }
	   }
	
