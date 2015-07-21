
public class Test {

	// Write a program to print values from 1 to 15 and write a condition where
	// 13 is not printed

	public static void main(String args[]) {
		for (int x = 1; x <= 15; x++) {
			System.out.println("value of x is:" + x);
			if  (x == 13) {
			continue;

			}
			System.out.println("value of x is:" + x);
			System.out.println("\n");

		}
	}

}
