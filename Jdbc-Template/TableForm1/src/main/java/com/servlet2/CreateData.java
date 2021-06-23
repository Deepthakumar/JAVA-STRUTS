package com.servlet2;
import java.sql.*;

public class CreateData {
	public static void main(String[] args)throws NullPointerException{
		Connection connection = Sql.getConnection();
		try {
			Statement stmt = connection.createStatement();
			stmt.execute("create table samples(EmpId integer primary key,"
					+ "Name varchar(20) not null,"
					+"City varchar(30) not null,"
					+"designation varchar(20) not null)");
			System.out.println("Created in Sql:)");
		}catch(SQLException se) {
			System.out.println(se.getMessage());
		}
	}

}
