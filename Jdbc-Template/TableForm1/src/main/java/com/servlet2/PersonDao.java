package com.servlet2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonDao {
	private final static Connection connection=Sql.getConnection();
	public static boolean insert(DetailsPerson e) {
		try {

			PreparedStatement p= connection.prepareStatement("insert into samples values(?,?,?,?)");
			p.setInt(1, e.getEmpId());
			p.setString(2, e.getName());
			p.setString(3, e.getCity());
			p.setString(4, e.getDesignation());
			p.execute();
			return true;
		}
		catch(SQLException ex) {
			System.out.println(ex.getMessage());
			return false;
		}
	} 

	public static List<DetailsPerson> getPeople(){

try      {
	        List<DetailsPerson> l=new ArrayList<DetailsPerson>();
		    ResultSet rs=connection.createStatement().executeQuery("select * from samples");
		    while(rs.next()) {
		    	DetailsPerson p=new DetailsPerson();
		    	p.setEmpId(rs.getInt(1));
		    	p.setName(rs.getString(2));
		    	p.setCity(rs.getString(3));
		    	p.setDesignation(rs.getString(4));
		    	l.add(p);
		    }

		    return l;
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}


