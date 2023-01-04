package org.test;

public class Banking2 implements Banking {

	@Override
	public void deposits() {
		System.out.println("4%");
		
	}

	@Override
	public void savings() {
		System.out.println("5%");
		
	}

	@Override
	public void fixed() {
		System.out.println("6%");
		
	}
	 public static void main(String[]args) {
	Banking2 b2=new Banking2();
	
	b2.deposits();
	b2.savings();
	b2.fixed();
	 }


}
