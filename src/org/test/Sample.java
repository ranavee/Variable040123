package org.test;

public class Sample {
	
	int a = 10; //instance variable
	static int b =20; //static variable
	
	private void add(){
		System.out.println("Inst var : "+a);
		a++;
		System.out.println("Inst after increment : "+a);
		
		System.out.println("Static variable : "+b);
		b++;
		
		System.out.println("Static variable after increment : "+b);
	
		System.out.println("GitTask - pull");
		}
	
	public static void main(String[] args) {
		Sample s = new Sample();
		s.add();
		
		Sample s1= new Sample();
		s1.add();
	}
	
	


}


