package library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//�鿴ͼ����
public class LookBook {
	Scanner scanner = new Scanner(System.in);
	public void lookBook(ArrayList tree){
		
		System.out.println("��ѡ����Ĳ鿴��ʽ��");
		
		while(true){
			
			System.out.println("A(�����˳��)  B(����������˳��)");
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
				System.out.println("����ѡ������������ѡ��");
			}
		}//while end
		
	}

}
