public class ArithmaticExcpetion {

	public static int i;

	public static void main(String[] args) {

		try {
			i = 10 / 0;
			System.out.println("Printig i" + i);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} finally {
			System.out.println("I am in finaly block");
		}

		System.out.println("Printed");
	}
}
