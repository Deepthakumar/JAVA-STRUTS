package com.handsons;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class GroceryDelete {
	public static void delete(Scanner sc, HashMap<String , Grocery> ag) {
		int count = 0;
		System.out.println("Enter Item Name To be Removed");
		Grocery gd = new Grocery();
		Iterator<Map.Entry<String, Grocery>> iterator = ag.entrySet().iterator();
		gd.setItemname(sc.next());
		while(iterator.hasNext()){
			
			Map.Entry<String, Grocery> entry= iterator.next();
			if(gd.getItemname().equals(entry.getKey())){
				count = 1;
			iterator.remove();
			
			}
			}
	if(count==0) {
		System.out.println("No such Item to be Deleted");
	}
System.out.println(ag);

	}
}