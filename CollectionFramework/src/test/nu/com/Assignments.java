package test.nu.com;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignments {

	// Initialise a String ArrayList
	// Add elements into String ArrayList
	// Trim the Size of ArrayList use trimToSize() method
	// Replace the value of existing element in ArrayList use. set() method
	// Increase the capacity(size) of ArrayList use ensureCapacity() method
	// Check whether ArrayList is empty or not use isEmpty() method

	public static void main(String[] args) {

		// Intilaise array
		ArrayList<String> s = new ArrayList<String>();
		s.add("Hello");
		s.add("Kitty");

		// printing size
		System.out.println(" trims the size of the array before triming " + s.size());

		// trying to trim the size
		s.trimToSize();

		// printing size
		System.out.println(" trims the size of the array after triming " + s.size());

		// printing arraylist values
		Iterator<String> itr1 = s.iterator();
		// 0 - Hello
		// 1 - World
		// 2 - null
		while (itr1.hasNext()) {
			System.out.println("Printing tha value of array elements before changing " + itr1.next());

		}
		// replacing the values
		s.set(1, "world");
		System.out.println("Printing Array" + s);

		// printing arraylist values
		Iterator<String> itr2 = s.iterator();
		// 0 - Hello
		// 1 - World
		// 2 - null
		while (itr2.hasNext()) {
			System.out.println("Printing tha value of  array elements after changing " + itr2.next());

		}

		// increase the capacity
		s.ensureCapacity(11);
				
		
		s.remove(1);
		s.remove(0);
		
		System.out.println("Finding if array is empty " + s.isEmpty());

	}

}
