package com.nutechnology.test;

public class SubClassA extends AbstractExample  {
	private int a = 5;
	private int b = 6 ;
	
	public SubClassA() {
		this(0, 1, 2);
		
		
		
	}
	
	public SubClassA(int a, int b, int c) {
		
	}
	public static void main (String [] args ) {
		SubClassA obj1 = new SubClassA();
		obj1.subtract();
		
		
		
	}

	@Override
	public void subtract() {
		System.out.println("prinitng method");
		
	}
	
	public void test(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	
}
