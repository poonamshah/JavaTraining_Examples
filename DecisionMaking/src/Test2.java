public class Test2 {

	// write a program to print the output.
	// Take string as an input = "STRINGS"

	// Print Rating in system out when char found in a string is R
	// Print Gold in system out when char found in a string is G
	// Print Iron in system out when Char found in a string is I

	public void printingString() {
		String s = "STRINGS";

		char[] c = s.toCharArray();
		for (char x : c) {

			if (x == 'R') {
				System.out.println("Rating");
			} else if (x == 'G') {
				System.out.println("Gold");
			} else if (x == 'I') {
				System.out.println("Iron");
			}
		}
	}

	public static void main(String[] args) {
		Test2 obj = new Test2();
		obj.printingString();

	}
}
