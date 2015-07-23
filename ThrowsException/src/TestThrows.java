import java.io.IOException;


public class TestThrows {
	
	void a () throws IOException {
		throw new IOException("device error in method a"); 
	}
	
	void b () throws IOException {
		a();
	}
	
	
	void c() {
		try {
			b();
		} catch (IOException e) {
			System.out.println("I m handling this exception "+e.getMessage());
		}
		
		
	}
	
	public static void main (String [] args) {
		TestThrows testThrows = new TestThrows();
		testThrows.c();
	}

}
