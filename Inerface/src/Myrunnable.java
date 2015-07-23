
/**
 * Runnable interface is implemented
 *
 */
public class Myrunnable implements Runnable {

	public void run() {

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
		}
			/**
			 * getting the priority of thread
			 */
			System.out.println("from runnable child thread 1,It's maxium priority =" + Thread.currentThread().getPriority());
			System.out.println("from runnable child thread 2,It's maxium priority =" + Thread.currentThread().getPriority());
			System.out.println("from runnable child thread 3,It's maxium priority =" + Thread.currentThread().getPriority());
			System.out.println("from runnable child thread 4,It's maxium priority =" + Thread.currentThread().getPriority());

		

	}
}
