import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMethods {

	public static void main(String[] args) {

		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Add");
		l1.add("1");
		l1.add("3");

		Iterator<String> itr = l1.iterator();
		while (itr.hasNext()) {
			System.out.println("Printing original linked List " + itr.next());

		}
		System.out.println("\n");
		// add first element and last element
		l1.addFirst("a");
		l1.addLast("5");

		Iterator<String> itr1 = l1.iterator();
		while (itr1.hasNext()) {
			System.out.println("Printing changed linked List " + itr1.next());

		}
		System.out.println("\n");
		// changing element at index 0
		l1.add(0, "b");

		Iterator<String> itr2 = l1.iterator();
		while (itr2.hasNext()) {
			System.out.println("Printing changed index 0 for  linked List "
					+ itr2.next());

		}

		System.out.println("\n");
		// removing elements
		l1.remove(2);
		l1.removeLast();

		Iterator<String> itr3 = l1.iterator();
		while (itr3.hasNext()) {
			System.out
					.println("Printing after removing elements in linked List "
							+ itr3.next());

		}

		// Get first and last elements from LinkedList - using getFirst and
		// getLast Method
		System.out.println("\n");
		System.out.println("printing first element " + l1.getFirst());
		System.out.println("printing last elements " + l1.getLast());

		// Replace element with a new value in LinkedList using set Method
		System.out.println("\n");
		l1.set(2, "hello");

		Iterator<String> itr4 = l1.iterator();
		while (itr4.hasNext()) {
			System.out
					.println("Printing after changing elements in linked List "
							+ itr4.next());

		}

		// Search element in LinkedList using indexOf and lastInexOf method
		System.out.println("\n");
		System.out.println("Printing index of a " + l1.indexOf("a"));

		System.out.println("Printing index of a " + l1.lastIndexOf("hello"));

		// Get Sub list of LinkedList using subList Method
		List<String> l2 = l1.subList(0, 2);

		System.out.println("\n");
		Iterator<String> itr5 = l2.iterator();
		while (itr5.hasNext()) {
			System.out.println("Printing the sub linked List " + itr5.next());

		}

	}

}
