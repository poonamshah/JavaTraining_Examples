import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		hash.put(1, "abc");
		hash.put(2, "xyz");
		hash.put(10, "efg");
		hash.put(11, "def");
		hash.put(12, "rim");

		// Using Iterator
		Iterator itr = hash.entrySet().iterator();
		while (itr.hasNext()) {

			// System.out.println(itr.next());
			Map.Entry mp = (Map.Entry) itr.next();

			System.out.println("key " + mp.getKey() + "Value " + mp.getValue());
		}

		// Using Entry used to get key and value separately
		// to get both ang values 
		for (Entry<Integer, String> mp : hash.entrySet()) {
			System.out.println("key " + mp.getKey() + "Value " + mp.getValue());

		}
		// to get only keys 
		for(Integer i :hash.keySet()) {
			System.out.println("key " + i);
		}
		
		Set<Integer> keys = hash.keySet();

		System.out.println("keys " + keys);
		
		hash.remove(1);
		
		for (Entry<Integer, String> mp : hash.entrySet()) {
			System.out.println("key " + mp.getKey() + "Value " + mp.getValue());

		}
	}

}
