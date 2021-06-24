package com.project3;
import java.sql.*;
import java.util.Scanner;

public class InsertData {
	public static void main(String[] args) {
		Connection connection = Sql.getConnection();
		Scanner sc = new Scanner(System.in);
		try {
			PreparedStatement ps = connection.prepareStatement("insert into samples values(?,?,?,?)");
			while(true) {
				System.out.println("Enter ID:");
				int empId = Integer.parseInt(sc.next());
				if(empId <=0) {
					System.out.println("All Data have been added to DataBase, Thank You:)");
					break;
				}
				System.out.println("Enter Name:");
				String name = sc.next();
				System.out.println("Enter City:");
				String city = sc.next();
				System.out.println("Enter Designation:");
				String designation = sc.next();
				ps.setInt(1, empId);
				ps.setString(2, name);
				ps.setString(3, city);
				ps.setString(4, designation);
				ps.execute();
				
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		sc.close();
		
	}

}
