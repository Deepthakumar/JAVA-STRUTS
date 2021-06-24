package com.training;

import java.util.ArrayList;
import java.util.List;

public class proj1 {
  public static void main(String[] n) {
	  new Main();new Carbohydrates();
	  Nutrients.test();
	  System.gc();
  }
	
}
class Nutrients{
	static List<Object> list = new ArrayList<Object>();
	static {
		List<Object> l = new ArrayList<Object>();
		l.add(new Main());
		l.add(new Main());
		list.add(new Main());
		l.add(new Carbohydrates());
		l.add(new Carbohydrates());
		list.add(new Carbohydrates());
	}
	static void test() {
		
	}
}