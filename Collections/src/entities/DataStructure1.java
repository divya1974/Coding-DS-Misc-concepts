package entities;

import java.util.HashSet;
import java.util.PriorityQueue;


public class DataStructure1 {

	PriorityQueue<Book> queue = 
            new PriorityQueue<Book>(15, new MyComparator());
	
	HashSet<Integer> set=new HashSet<>();
	
	public void Insert(int pages)
	{
		 queue.add(new Book(pages)); //O(logn)
		 set.add(pages);
	}
	
	public int GetMin()
	{
		return queue.poll().getPages(); //o(1)
	}
	
	 public Boolean search(int pages)
	 {
		if(set.contains(pages)) //o(1)
			return true;
		else return false;
	 }
	 

	

}
