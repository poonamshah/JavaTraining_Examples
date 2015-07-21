package com.nutechnology.test;

public abstract class AbstractExample {
	private int a = 5;
	private int b = 5;
	
	
	public AbstractExample() {
		System.out.println("Printing A" +a);
	}
	private void add () {
		System.out.println("Adding a and b" +(a+b));
		
		
	}
	
	 abstract protected void subtract();
	

}

