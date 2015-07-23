public class ThreadRun {
	public static void main(String[] args) {
		for(int i=1;i<=2;i++){
			System.out.println("from main thread");
		}
		/**
		 * Mythread class object is created and start method is invoked
		 */
		Mythread t=new Mythread();
		t.start();
		/**
		 * Printing the name of the Thread
		 */
		System.out.println("Name of the class is "+t.getName());
		/**
		 * setting the minimum priority of thread
		 */
		t.setPriority(Thread.MIN_PRIORITY);
		
		
		
		
		/**
		 * Myrunnable class object is created;
		 * This class implements the Runnable interface and this Runnable interface
		 * has no start method only Thread class contains start() method.
		 * so start() method cannot be revoked with Myrunnable class object;
		 * So Thread object is created by passing the Myrunnble class object as the parameter and 
		 * start() method is invoked with Thread object.
		 * In case of not passing the Myrunnable object into Thread object there is no way to connect
		 *  both Thread and Myrunnable objects for executing the Myrunnable class
		 * 
		 */
		Myrunnable r=new Myrunnable();
		Thread tr=new Thread(r);
		System.out.println("Myrunnable Thread is also sleeping........");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
		}
		
		tr.start();
		
		System.out.println("Name of the class is "+tr.getName());
		/**
		 * setting the maximum priority of thread
		 */
		tr.setPriority(Thread.MAX_PRIORITY);
		
		
	}

}
