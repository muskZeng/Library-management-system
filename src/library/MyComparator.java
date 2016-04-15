package library;

import java.util.Comparator;

//比较器 这个是比较日期的
public class MyComparator implements Comparator<Book>{
	

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		
		return o1.date.compareTo(o2.date);
	}

}
