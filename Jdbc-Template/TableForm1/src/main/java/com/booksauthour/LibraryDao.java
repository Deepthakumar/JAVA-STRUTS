package com.booksauthour;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class LibraryDao {
	private final static Connection connection=Sql2.getConnection();
	public static boolean insert(Books e) {
		try {

			PreparedStatement p= connection.prepareStatement("insert into Books values(?,?,?,?,?)");
			p.setInt(1, e.getBid());
			p.setString(2, e.getName());
			p.setInt(3, e.getPrice());
			p.setInt(4, e.getAuthourid());
			p.setInt(5, e.getPages());
			p.execute();
			return true;
		}
		catch(SQLException ex) {
			System.out.println(ex.getMessage());
			return false;
		}
	} 
	public static List<Books>getBookdet(){
		try      {
	        List<Books> l=new ArrayList<Books>();
		    ResultSet rs=connection.createStatement().executeQuery("select * from Books");
		    while(rs.next()) {
		    	Books a=new Books();
		    	a.setBid(rs.getInt(1));
		    	a.setName(rs.getString(2));
		    	a.setPrice(rs.getInt(3));
		    	a.setAuthourid(rs.getInt(4));
		    	a.setPages(rs.getInt(5));
		    	l.add(a);
		    }

		    return l;
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static List <Authour> getAuthourdet(){
		try      {
	        List<Authour> l=new ArrayList<Authour>();
		    ResultSet rs=connection.createStatement().executeQuery("select * from Authour");
		    while(rs.next()) {
		    	Authour a=new Authour();
		    	a.setAuthourid(rs.getInt(1));
		    	a.setName(rs.getString(2));
		    	
		    	l.add(a);
		    }

		    return l;
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
}

