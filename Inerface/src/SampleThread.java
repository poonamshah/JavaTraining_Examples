public class SampleThread extends Thread {

	public static void main(String args[]) {

		System.out.println("before sleep " + System.currentTimeMillis());
		SampleThread a = new SampleThread();

		SampleThread s1 = new SampleThread();
		SampleThread s2 = new SampleThread();

		s1.setPriority(Thread.MIN_PRIORITY);
		s2.setPriority(Thread.MAX_PRIORITY);

		s1.start();
		s2.start();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("After sleep " + System.currentTimeMillis());
		System.out.println("\n");
	}

	public void run() {
		System.out.println("current Thread is "
				+ Thread.currentThread().getName());
		System.out.println("current Thread priority is "
				+ Thread.currentThread().getPriority());

	}

}
