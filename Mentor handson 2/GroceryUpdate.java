package com.handsons;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class GroceryUpdate {
	public static void update(Scanner sc, HashMap<String , Grocery> ag) {
		int count = 0;
		Grocery gd = new Grocery();
		Iterator<Map.Entry<String, Grocery>> iterator = ag.entrySet().iterator();
		System.out.println("Enter Item name to be updated");
		gd.setItemname(sc.next());
		while(iterator.hasNext()){
			Map.Entry<String, Grocery> entry= iterator.next();
			if(gd.getItemname().equals(entry.getKey())){
				count=1;
				//System.out.println("Enter Itemname to be updated");
				
				//gd.setItemname(sc.next());
				System.out.println("Enter Category to be updated");
				gd.setCategory(sc.next());
				System.out.println("Enter Quantity to be updated");
				gd.setQuantity(sc.nextInt());
				ag.put(gd.getItemname() , gd );
				}
			}
		if(count==0) {
			System.out.println("No such Item to be Updated");
		}
	
System.out.println(ag);
			
			}
			
		
	}


