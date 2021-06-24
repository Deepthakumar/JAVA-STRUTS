package com.project4;
interface Task{
	void activity();
}
abstract class Alphabet{
	protected static int sno;
	protected static String type;
	Alphabet(){}
	Alphabet(int sno,String type){
		this.sno = sno;
		this.type = type;
		
	}
	public abstract void m();
		

	 public abstract void n();
		
	
}
class A extends Alphabet implements Task{
	A(){}
	
	A(int sno,String type){
		super(sno,type);
		
		
		
	}
	public void m() {
		System.out.println("Sno"  +sno);
		
	}
	public void n() {
		System.out.println("Type"  +type);
		
	}
	public void activity() {
		System.out.println("Activity zone A");
	}
	
}
class B extends Alphabet implements Task{
	B(){}
	B(int sno,String type){
		super(sno,type);
		
	
		
		
	}
	public void m() {
		System.out.println("Sno"  +sno);
		
	}
	public void n() {
		System.out.println("Type"  +type);
		
	}
	public void activity() {
		System.out.println("Activity zone B");
	}
	
}
class C extends Alphabet implements Task{
	C(){}
	C(int sno,String type){
		super(sno,type);
		
		
	}
	public void m() {
		System.out.println("Sno"  +sno);
		
	}
	public void n() {
		System.out.println("Type"  +type);
		
		
	}
	public void activity() {
		System.out.println("Activity zone C");
	}
	
}
class D extends Alphabet implements Task{
	D(){}
	D(int sno,String type){
		super(sno,type);
		
		
		
		
	}
	public void m() {
		System.out.println("Sno"  +sno);
		
	}
	public void n() {
		System.out.println("Type"  +type);
		
	}
	public void activity() {
		System.out.println("Activity zone D");
	}
	
}

	class ClassProcess{
		public static void process(Alphabet a) {
			a.m();
			a.n();
		}
	}
	class Process{
		public static void process(Task t) {
			t.activity();
		}
	}
public class Driver {
	public static void main(String[] args) {
	Process.process(new A(1, "Alphabet"));
	Process.process(new B(2, "Alphabet"));
	Process.process(new C(3, "Alphabet"));
	Process.process(new D(4, "Alphabet"));
	ClassProcess.process(new A(1, "Alphabet"));
	ClassProcess.process(new B(2, "Alphabet"));
	ClassProcess.process(new C(3, "Alphabet"));
	ClassProcess.process(new D(4, "Alphabet"));

}
}
