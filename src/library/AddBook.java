package library;

import java.util.ArrayList;
import java.util.Scanner;

public class AddBook {
	Scanner scanner = new Scanner(System.in);
	public void addBook(ArrayList tree){
		System.out.println("增加图书");
		
		System.out.println("请输入图书名：");
		String name = scanner.next();
		System.out.println("请输入作者：");
		String author = scanner.next();
		System.out.println("请输入出版社：");
		String company = scanner.next();
		System.out.println("请输入出版日期：");
		String date = scanner.next();
		System.out.println("请输入书号：");
		int num = scanner.nextInt();
		System.out.println("新书信息如下");
		System.out.println( new Book(name,author,company,date,num));
		System.out.println("是否保存改图书     Y(是)    S(否)");
		String s = scanner.next();
		if("y".equalsIgnoreCase(s)){
			
			tree.add(new Book(name,author,company,date,num));
			System.out.println("添加图书成功");
		}else if("s".equalsIgnoreCase(s)){
			System.out.println("添加图书失败");
		}
		System.out.println("当前图书如下：");
		System.out.println(tree);
		
		
	}

}
