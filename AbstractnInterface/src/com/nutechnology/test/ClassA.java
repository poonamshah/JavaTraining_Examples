package com.nutechnology.test;

public class ClassA extends AbstractExample implements Test, TestB{

	private int a;
	private int b;
	@Override
	public void add() {
		System.out.println("printing subtraction" +(b+a));

	}

	@Override
	public void subtract() {
		System.out.println("printing subtraction" +(b-a));

	}

	@Override
	public void multiply() {

	}

	@Override
	public void divide() {

	}

	@Override
	public void squareroot() {
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

}
