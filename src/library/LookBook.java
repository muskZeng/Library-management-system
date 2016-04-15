package library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//查看图书类
public class LookBook {
	Scanner scanner = new Scanner(System.in);
	public void lookBook(ArrayList tree){
		
		System.out.println("请选择你的查看方式：");
		
		while(true){
			
			System.out.println("A(按书号顺序)  B(按出版日期顺序)");
			String s = scanner.next();
			if("a".equalsIgnoreCase(s)){
				Collections.sort(tree,new MyComparator2());
				System.out.println(tree);
				break;
			}else if("b".equalsIgnoreCase(s)){
				Collections.sort(tree,new MyComparator());
				System.out.println(tree);
				break;
			}else{
				System.out.println("您的选择有误，请重新选择");
			}
		}//while end
		
	}

}
