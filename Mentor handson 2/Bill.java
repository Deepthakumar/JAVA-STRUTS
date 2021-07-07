package com.handsons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Bill{
	
	
	public static void main(String[] args) {
		int count = 0;
		Grocery gr = new Grocery();
		HashMap<String,Grocery> hm = new HashMap<String,Grocery>();
		Scanner scan = new Scanner(System.in);
	
		while(true) {
		
	System.out.println("press 1 to add press 2 to delete press 3 to update and press 0 to terminate");
	
	count = scan.nextInt();
	if(count==1) {
		GroceryAdd.addition(scan, hm);
	}
	if(count==2) {
		GroceryDelete.delete(scan, hm);
	}
	if(count==3) {
		GroceryUpdate.update(scan,hm);
		
	}
	if(count==0) {
		break;
	}
	
	
	
		}
	
	

	
	 }
}
	 
	 



