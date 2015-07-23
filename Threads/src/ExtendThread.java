
public class ExtendThread extends Thread {
	
	public void run() { 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" I am in Run method");
	}
	
	public static void main(String [] args) {
		ExtendThread obj = new ExtendThread();
		obj.start();
		
		System.out.println("Hello World");
		
		
	}

}
