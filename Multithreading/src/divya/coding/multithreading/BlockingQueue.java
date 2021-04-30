package divya.coding.multithreading;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue {
		 private List queue = new LinkedList();
		 private int limit = 10;
		 public BlockingQueue(int limit) {
		  this.limit = limit;
		 }
		 public synchronized Runnable enqueue(Integer item) throws InterruptedException {
		  while (this.queue.size() == this.limit) {
			  System.out.print(" Enqueue Thread waiting");
		   wait();
		  }
		  if (this.queue.size() == 0) {
		   notifyAll();
		  }
		  this.queue.add(item);
		  System.out.print("Thread executed item enqueued");
		return null;
		 }
		 public synchronized Runnable dequeue() throws InterruptedException {
		  while (this.queue.size() == 0) {
			System.out.print("Dequeue Thread waiting");
		   wait();
		  }
		  if (this.queue.size() == this.limit) {
		   notifyAll();
		  }
		  this.queue.remove(0);
		  System.out.print("Thread executed item dequeued");
		  return null;
		 }
		
		
}
