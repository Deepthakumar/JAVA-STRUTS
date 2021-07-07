package com.handsons;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GroceryAdd {
	public static void addition(Scanner sc, HashMap<String , Grocery> ag) {
		
		try {
			Grocery grocery = new Grocery();
		System.out.println("Enter the Item Name ");
		grocery.setItemname(sc.next());
		System.out.println("Enter The Item Category");
		grocery.setCategory(sc.next());
		System.out.println("Enter The Item Quantity");
		grocery.setQuantity(sc.nextInt());
		ag.put(grocery.getItemname(), grocery);
		
		System.out.println(ag);
		}catch(InputMismatchException ex) {
			System.out.println("Quanitity can only be in numbers");
			
		}
		
	}

}
