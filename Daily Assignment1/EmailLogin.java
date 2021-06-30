package com.handsons;

import java.security.KeyStore.Entry;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class EmailLogin {
	private static String user;
	private static String password;
	//Exception e =  new Exception("Incorrect Password");
	
	public static void main(String[] args) {
		
	try {	
	
		Scanner scan = new Scanner (System.in);

		System.out.println("Login Page");
			System.out.println("User Id:");
			user = scan.nextLine();
			System.out.println("Password:");
			password = scan.nextLine();
			Pattern pattern = Pattern.compile("@gmail", Pattern.CASE_INSENSITIVE);
		    Matcher matcher = pattern.matcher("@gmail");
		    boolean matchFound = matcher.find();
		    if(matchFound) {
		      System.out.println("User "
		      		+ "Name Is Valid");
		    } else {
		      System.out.println("Invali User Name");
		    }
			
			if(password.length()<8) {
				Exception e = new Exception();
				throw e;
				
			}
			scan.close();
	}
		catch(Exception a) {
			System.out.println("In Correct Password");
		}
				
		
		}
}

		
	


	
	
