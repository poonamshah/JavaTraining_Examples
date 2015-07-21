public class Test3 {

	// write a program to print the output.
	// Take string as an input = "STRINGS"

	// Print Rating in system out when char found in a string is R
	// Print Gold in system out when char found in a string is G
	// Print Iron in system out when Char found in a string is I

	public void printingString() {
		String s = "STRINGS";

		char[] c = s.toCharArray();
		for (char x : c) {

			switch (x) {
			case 'R':
				System.out.println("Ratng");
				break;
			case 'G':
				System.out.println("Gold");
				break;
			case 'I':
				System.out.println("Iron");
				break;

			}

		}

	}

	public static void main(String[] args) {
		Test3 obj = new Test3();
		obj.printingString();

	}

}