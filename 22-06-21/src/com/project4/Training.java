package com.project4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Set;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.TreeSet;

public class Training implements Comparable<Training> {
	private static final TreeSet<Training> person = null;
	int i; String S;
	static String words;
	Training(int i,String S){
		this.i = i;
		this.S = S;
	}
	public String toString() {
		return i+"," +S+" "; 
	}
	@Override
	public int compareTo(Training o) {
		// TODO Auto-generated method stub
		return S.compareTo(o.S);
	}
	public static void main(String[] args)throws Exception{
		Set<Training> obj= new TreeSet<Training>();
		File inputFile = new File("C:\\Users\\BCP\\Documents\\sample1.txt");
	File outputFile = new File("C:\\Users\\BCP\\Documents\\sample2.txt");
	FileReader read; FileWriter write;
	try
	{
		read =new FileReader(inputFile);
		write = new FileWriter(outputFile);

		BufferedReader read2 = new BufferedReader (read);
		BufferedWriter write2= new BufferedWriter(write);
		
		while((words = read2.readLine())!=null){
			String[] separate = words.split(",");
			Training person = new Training (Integer.parseInt(separate[0]),separate[1]);
			obj.add(person);
		}
		System.out.println(obj);
		for(Training sorted:obj) {
			write2.write(sorted.toString());
			write2.newLine();
		}
		write2.flush();
		Thread.sleep(5000);
		write2.close();read2.close();
	}
	catch(Exception e) {
		String exception = e.getMessage();
		System.out.println(exception);
	}
	}
	

}
