package divya.coding.multithreading;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		//First way of using Threads, extend Thread class
		/*Thread t1 = new ThreadClass();
		Thread t2 = new ThreadClass();
		Thread t3 = new ThreadClass();
		t1.start();
		t2.start();
		t3.start();
		
		
		Runnable r = new RunnableClass();
		Thread t4 = new Thread(r);
		Thread t5 = new Thread(r);
		Thread t6 = new Thread(r);
		
		t4.start();
		t5.start();
		t6.start();*/
		
		BlockingQueue obj =new BlockingQueue(3);
		Thread t1 = new Thread(obj.enqueue(1));
		Thread t2 = new Thread(obj.enqueue(2));
		Thread t3 = new Thread(obj.enqueue(3));
		Thread t4 = new Thread(obj.enqueue(4));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t3.dumpStack();
		

	}

}
