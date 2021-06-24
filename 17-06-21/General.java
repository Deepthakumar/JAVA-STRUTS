package com.training;

public interface General {
	public static void finalize(Object x) {
		System.out.println(x + "is deleted");
	}

}
