package com.training;

public class Main {
	private int a; private static int b;
	Main() { a = b++; }

	protected void finalize() {
		General.finalize(String.valueOf(a));
	}

}
class Carbohydrates{
	private int a; private static int b;
	Carbohydrates(){
		a = b++;
		
	}
	public void finalize() {
		General.finalize(String.valueOf(b));
	}
}

