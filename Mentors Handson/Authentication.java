package com.handsons;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Authentication {
	
public static void main(String[] args) {
	System.out.println("Welcome to Login Page11");
	Scanner scanner= new Scanner(System.in);
	try {
	int count=0;
	
	while(true) {
		System.out.println("To start press 1 or press 0 to terminate");
		count= scanner.nextInt();
		if(count==0) break;
		if(count==1) {
			System.out.println("Enter Email ID: ");
			AuthenticationEntry authentication= new AuthenticationEntry();
			authentication.setMailId(scanner.next());
			String regex= "^[a-zA-Z]+@[gmail.com]+$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher= pattern.matcher(authentication.getMailId());
			if(matcher.matches())System.out.println("Email ID is Valid :)");
			else { 
				throw new NullPointerException();
			}
			
			System.out.println("Enter password: ");
			authentication.setPassword(scanner.next());
			String password= authentication.getPassword();
			if(password.length()<8) {
				throw new ArithmeticException();
			}else {
				System.out.println("Password is accepted :)");
			}
			
			System.out.println("Enter your mobile number: ");
			authentication.setNumber(scanner.nextLong());
			String i= Long.toString(authentication.getNumber());
			if(i.length()<10 && i.length()>10) {
				System.out.println("Invalid mobile number");
			}else {
				System.out.println("Mobile.no is Valid");
			}
		}		
	}
	}catch(NullPointerException ex) {
		System.out.println("Email ID is Not Valid");
	}catch(ArithmeticException ex) {
		System.out.println("Invalid password");
	}catch(InputMismatchException ms) {
		System.out.println("Mobile Number can have only 10 digit numbers");
	}
	scanner.close();
}
}