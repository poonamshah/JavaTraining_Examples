
/**
 * Thread is extended
 *
 */
public class Mythread extends Thread {
	public void run() {
		
			/**
			 * getting the priority of thread
			 */
			System.out.println("From thread child thread 1,It's minimum priority = "+Thread.currentThread().getPriority());
			System.out.println("From thread child thread 2,It's minimum priority = "+Thread.currentThread().getPriority());
			/**
			 * pausing the execution for 10000 milliseconds by using Sleep() method
			 */
			System.out.println("Thread is sleeping........");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				
			}
			
			System.out.println("From thread child thread 3,It's minimum priority = "+Thread.currentThread().getPriority());
			System.out.println("From thread child thread 4,It's minimum priority = "+Thread.currentThread().getPriority());
			
			
		

	}

}
