package library;
//���Ǵ洢��ļ���
import java.util.ArrayList;

public class MemoryBook {
	static	public void memoryBook(ArrayList tree){
		
		Book book1 = new Book("java���˼��","LOL","��е������","20060606",20140317);
		Book book2 = new Book("java���ļ���","LOL","��ҵ��е������","20080606",20150317);
		Book book3 = new Book("���Ʋ��","LOL","�����","20090606",20130317);
		Book book4 = new Book("���޴�½","LOL","��������","2010606",20150317);
		Book book5 = new Book("�ǳ���","LOL","ʢ����","20050606",20180317);
		tree.add(book1);
		tree.add(book2);
		tree.add(book3);
		tree.add(book4);
		tree.add(book5);
	}
	
	
	
}
