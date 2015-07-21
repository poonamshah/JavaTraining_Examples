package com.nutechnology.test;

public class TestC {

	public void add(int a, int b) {
		
		for (int i = 0; i < 10; i++) {
			a = i; // 0 1 2 9
			b = i + 1; // 1 2 3 10

		}

		System.out.println("printing a +b " + (a + b));

	}

	public static void main(String[] args) {
		TestC obj = new TestC();
		obj.add(3, 4);

		/* System.out.print(obj.b); */

	}

}
