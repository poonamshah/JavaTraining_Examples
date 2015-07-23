
public class TestThrow2 {

	public void testThrow(String color) {

		if (color.equals("Red")) {
			throw new ArithmeticException("This is not a valid color");

		} else {
			System.out.println("Welcome !!");
		}

	}

	public static void main(String[] args) {
		TestThrow2 obj = new TestThrow2();
		obj.testThrow("Red");
	}

}
