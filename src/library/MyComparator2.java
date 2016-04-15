package library;

import java.util.Comparator;

public class MyComparator2 implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		
		return o1.bookNum-o2.bookNum;
	}

}
