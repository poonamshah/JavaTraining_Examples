public class fibo {
	public static void main(String[] args) {
		// int x = 0;
		int y = 1;
		int n = 50;
		int z;

		for (int i = 0; i < n; i++) {
			z = i + y; // z = 1
			System.out.print(z);
			i = y; // x = 1
			y = z; // y = 1

		}

	}
}
