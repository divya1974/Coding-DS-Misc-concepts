package divya.coding.multithreading;

public class RunnableClass implements Runnable  {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 6; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);  	

}
	}
}
