import java.util.Iterator;
import java.util.LinkedList;

public class Test {

	public void initialisingLinkedList() {
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("A");
		l1.add("b");
		l1.add("c");

		// using for loop
		for (int i = 0; i < l1.size(); i++) {
			System.out.println("Prntin using for Loop" + l1.get(i));

		}
		// using while loop
		int count = 0;
		while (l1.size() < count) {
			System.out.println("Prntin using for Loop" + l1.get(count));
			count++;
		}

		// using advance for loop
		for (String x : l1) {
			System.out.println(x);
		}

		// Using Iterator
		Iterator<String> itr = l1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
