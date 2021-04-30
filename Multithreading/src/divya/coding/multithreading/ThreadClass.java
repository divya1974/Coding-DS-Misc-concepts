package divya.coding.multithreading;

public class ThreadClass extends Thread {
	static int j=0;
	@Override
	public void run() {
		for (int i=0; i <= 15; i++) {
		System.out.println(Thread.currentThread().getName() 
                + ": " + i + j++);
		}
	}

}
