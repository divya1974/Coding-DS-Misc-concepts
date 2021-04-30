package entities;

import java.util.Comparator;

public class MyComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
	  return o1.getPages()-o2.getPages();
	}

}
