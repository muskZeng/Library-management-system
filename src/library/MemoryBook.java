package library;
//这是存储书的集合
import java.util.ArrayList;

public class MemoryBook {
	static	public void memoryBook(ArrayList tree){
		
		Book book1 = new Book("java编程思想","LOL","机械出版社","20060606",20140317);
		Book book2 = new Book("java核心技术","LOL","工业机械出版社","20080606",20150317);
		Book book3 = new Book("斗破苍穹","LOL","起点网","20090606",20130317);
		Book book4 = new Book("斗罗大陆","LOL","红袖添香","2010606",20150317);
		Book book5 = new Book("星辰变","LOL","盛大网","20050606",20180317);
		tree.add(book1);
		tree.add(book2);
		tree.add(book3);
		tree.add(book4);
		tree.add(book5);
	}
	
	
	
}
