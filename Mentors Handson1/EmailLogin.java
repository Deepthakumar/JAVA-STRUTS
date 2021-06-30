package com.handsons;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class EmailLogin {
	
	public static void main(String[] args) {
		 EmailModel e = new EmailModel();
		 String regex = "@";
		 
		
	Scanner scan = new Scanner (System.in);
		
       System.out.println("Login Page");
	   System.out.println("Email Id:");
	
	   e.setEmailid(scan.next());
	   String user = e.getEmailid();
	   Pattern pattern = Pattern.compile(regex); 
	   Matcher matcher = pattern.matcher(user);
	   boolean found1 = user.contains(regex);
	  // boolean found1 = true;
	 
	   
	 System.out.println("Password:");
		
		e.setPassword(scan.next());
		String s2 = e.getPassword();
		  
		            
		  if(found1){    
		                
			  System.out.println("Validation Success");
		     		    } else 
		     		    {
		     		      System.out.println("Email Id does not exist");
		     		    }
		//  String password = e.getPassword();
		            if(s2.length() < 8) {
						
						System.out.println("Invalid Password");
						System.out.println("Validation Failed");
						
						
					}
						
					scan.close();
			   }
			
				
	}
		
		              
		
			
			
		


		
	


	
	
