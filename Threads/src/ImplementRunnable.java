public class ImplementRunnable implements Runnable {

	@Override
	public void run() {

		System.out.println("I am in run method 1"); // Running
		System.out.println("I am in run method 2"); // Running
		System.out.println("I am in run method 3"); // Running
		System.out.println("I am in run method 4"); // Running
		System.out.println("I am in run method 5"); // Running
		System.out.println("I am in run method 6"); // Running
		System.out.println("I am in run method 7"); // Running
		System.out.println("I am in run method 8"); // Running
		System.out.println("I am in run method 9"); // Running
		System.out.println("I am in run method 10"); // Running
		System.out.println("I am in run method 11"); // Running
		System.out.println("I am in run method 12"); // Running
		System.out.println("I am in run method 13"); // Running
		System.out.println("I am in run method 14"); // Running
		System.out.println("I am in run method 15"); // Running

	}

	// dead or terminated
	public static void main(String[] args) throws InterruptedException {

		ImplementRunnable obj = new ImplementRunnable();
		Thread t = new Thread(obj); // Thread is in new stage
		// System.out.println("Getting Thread  for thread 0 "+t.isAlive());

		Thread t2 = new Thread(obj); // Thread is in new stage
		// System.out.println("Getting Thread  for thread 1 "+t2.isAlive());

		t.start();
		t2.start();
		try {
			t.wait();
			t2.notify();
		} catch (IllegalMonitorStateException ie) {

		}
		/*
		 * // int a // t and t 2
		 * 
		 * 
		 * // t.wait() t2.wait()
		 * 
		 * // t1 - 1 // t2 -1 // t1 -2 // t2 -2
		 * 
		 * 
		 * //t2.sleep(100000);
		 * 
		 * 
		 * System.out.println("Getting Thread name "+t.getName());
		 * System.out.println("Getting Thread name "+t2.getName());
		 */

		/*
		 * t.setPriority(6);
		 * System.out.println("Getting Thread priority for thread 0 "
		 * +t.getPriority());
		 * System.out.println("Getting Thread priority for thread 1 "
		 * +t2.getPriority());
		 */

	}

}
