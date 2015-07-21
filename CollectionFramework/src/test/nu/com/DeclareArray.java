package test.nu.com;

import java.util.ArrayList;
import java.util.Iterator;

public class DeclareArray {

	
	
	

	public static void main(String[] args) {
		
		String[] a = { "a", "b", "c" };
		
		/*for(int i = 0; i <a.length; i++) {
			System.out.println("Looping Array " +a[i]);
		}*/
		
		char[] b = { 'a', 'b', 'c' };
		int[] c = { 1, 2, 3 };

		String[] a1 = new String[10];
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Abc");
		arrayList.add("xyz");
		
		
		/*for(String s : arrayList) {
			System.out.println("Using advance for loop "+s);
			
		}
		
		Iterator itr = arrayList.iterator();
		while(itr.hasNext())  {
			System.out.println("Using iterator loop " + itr.next());
		}
		
		int count = 0;
		while (arrayList.size() > count) {
			System.out.println("Using while loop " + arrayList.get(count));
			count++;
		}*/
		System.out.println("Finding Size before removing element " +arrayList.size());
		arrayList.remove(1);
		
		// ctrl space
		arrayList.trimToSize();
		
		System.out.println("Finding Size after removing element " +arrayList.size());
		/*for(int j =0; j <arrayList.size(); j++) {
			
			System.out.println("Looping Arraylist " +arrayList.get(j));
		}*/
		
		
			
			

	}

}
