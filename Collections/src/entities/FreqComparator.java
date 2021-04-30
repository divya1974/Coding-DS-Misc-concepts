package entities;

import java.util.Comparator;

public class FreqComparator implements Comparator<Node> {

	@Override
	public int compare(Node node1, Node node2) {
		int c;
	    c = node2.getFreq()-node1.getFreq();
	  /*  if (c == 0)
	    {
	    	int d = node2.getKey()-node1.getKey();
	    	return d;
	    }*/
		return c;
	}

}
