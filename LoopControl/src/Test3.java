
public class Test3 {

	// Write a program to reverse the numbers

	public void reverseNumber() {

		int x = 1234;
		int r;
		int q;
		while (x > 0) {
			q = x / 10;
			r = x / 10;
			System.out.println(r);
		}
	}

	public static void main(String[] args) {

		Test3 obj = new Test3();
		obj.reverseNumber();

	}
}
