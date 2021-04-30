package entities;
import java.util.HashMap;
import java.util.PriorityQueue;

import entities.FreqComparator;
import entities.Node;

public class TopKelements {
	
	HashMap<Integer, Node> hash=new HashMap<Integer,Node>();
	PriorityQueue<Node> queue=new PriorityQueue<Node>(new FreqComparator());

	public TopKelements() {
		
	}
	
	public void AddElement(int key)
	{
		int f=1;
		if(hash.containsKey(key))
		{
		/*	int f=hash.get(key).freq+1;
			hash.get(key).setFreq(f);
			return;*/
			Node no=hash.get(key);
			f=no.getFreq()+1;
			hash.remove(key);
			queue.remove(no);
		}
		Node n=new Node(key,f);
		hash.put(key,n);
		queue.add(n);
		return;
	}
	

	public void ReadTopK()
	{
		while (!queue.isEmpty()) { 
			//queue.peek()
            System.out.println(queue.poll().getKey());
            
		}
	}
	
}
