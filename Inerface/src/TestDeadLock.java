
public class TestDeadLock {
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();

	public static void main(String args[]) {

		SampleThread1 T1 = new SampleThread1();
		SampleThread2 T2 = new SampleThread2();
		T1.start();
		T2.start();
	}

	private static class SampleThread1 extends Thread {
		public void run() {
			synchronized (Lock1) {
				System.out.println("Thread 1: Holding lock 1...");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
				System.out.println("Thread 1: Waiting for lock 2...");
				synchronized (Lock2) {
					System.out.println("Thread 1: Holding lock 1 and 2...");
				}
			}
		}
	}

	private static class SampleThread2 extends Thread {
		public void run() {
			synchronized (Lock2) {
				System.out.println("Thread 2: Holding lock 2...");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
				System.out.println("Thread 2: Waiting for lock 1...");
				synchronized (Lock1) {
					System.out.println("Thread 2: Holding lock 1 and 2...");
				}
			}
		}
	}
}