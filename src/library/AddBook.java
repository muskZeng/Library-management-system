package library;

import java.util.ArrayList;
import java.util.Scanner;

public class AddBook {
	Scanner scanner = new Scanner(System.in);
	public void addBook(ArrayList tree){
		System.out.println("����ͼ��");
		
		System.out.println("������ͼ������");
		String name = scanner.next();
		System.out.println("���������ߣ�");
		String author = scanner.next();
		System.out.println("����������磺");
		String company = scanner.next();
		System.out.println("������������ڣ�");
		String date = scanner.next();
		System.out.println("��������ţ�");
		int num = scanner.nextInt();
		System.out.println("������Ϣ����");
		System.out.println( new Book(name,author,company,date,num));
		System.out.println("�Ƿ񱣴��ͼ��     Y(��)    S(��)");
		String s = scanner.next();
		if("y".equalsIgnoreCase(s)){
			
			tree.add(new Book(name,author,company,date,num));
			System.out.println("���ͼ��ɹ�");
		}else if("s".equalsIgnoreCase(s)){
			System.out.println("���ͼ��ʧ��");
		}
		System.out.println("��ǰͼ�����£�");
		System.out.println(tree);
		
		
	}

}
