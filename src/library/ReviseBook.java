package library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ReviseBook{
	Scanner scanner = new Scanner(System.in);
	public void reviseBook(ArrayList tree){
		System.out.println("�����޸�ͼ������ϵͳ");
		System.out.println("��ǰ��ͼ����Ϣ���£�");
		Collections.sort(tree,new MyComparator2());
		System.out.println(tree);
		boolean flag1 = true;
		boolean flag3 = true;
	while(flag1){
		System.out.println("������Ҫ�޸ĵ����");
		int i = scanner.nextInt();
		
		Iterator<Book> it = tree.iterator();
		
		boolean flag2 = false;
		while(it.hasNext()){                       // ��ֱ������֮�ʰ�
			
			Book book = it.next();
			if(book.bookNum==i){
				System.out.println(book);
				while(true){
					System.out.println("��ѡ��Ҫ�޸ĵ����ԣ�A(����)  B(����)  C(������) D(��������) E(������һ���˵�)");
					String s = scanner.next();
					if("a".equalsIgnoreCase(s)){
						//�����޸�
						System.out.println("�������޸ĵ�����");
						String str1a = scanner.next();
						System.out.println("�Ƿ񱣴��޸ĺ�����ݣ�Y(��)   N(��)");
						String str2a = scanner.next();
						if("y".equalsIgnoreCase(str2a)){
				
							book.name=str1a;
							System.out.println("�޸ĳɹ�������");
							System.out.println("�޸ĺ��ͼ��Ϊ"+book);
							
						}
						
						
					}else if("b".equalsIgnoreCase(s)){
						//�����޸�
						System.out.println("�������޸ĵ�����");
						String str1b = scanner.next();
						System.out.println("�Ƿ񱣴��޸ĺ�����ݣ�Y(��)   N(��)");
						String str2b = scanner.next();
						if("y".equalsIgnoreCase(str2b)){
				
							book.author=str1b;
							System.out.println("�޸ĳɹ�������");
							System.out.println("�޸ĺ��ͼ��Ϊ"+book);
							
						}
					}else if("c".equalsIgnoreCase(s)){
						//�������޸�
						System.out.println("�����������");
						String str1c = scanner.next();
						System.out.println("�Ƿ񱣴��޸ĺ�����ݣ�Y(��)   N(��)");
						String str2c = scanner.next();
						if("y".equalsIgnoreCase(str2c)){
				
							book.company=str1c;
							System.out.println("�޸ĳɹ�������");
							System.out.println("�޸ĺ��ͼ��Ϊ"+book);
							
						}
					}else if("d".equalsIgnoreCase(s)){
						//���������޸�
						System.out.println("�������޸ĵ�����");
						String str1d = scanner.next();
						System.out.println("�Ƿ񱣴��޸ĺ�����ݣ�Y(��)   N(��)");
						String str2d = scanner.next();
						if("y".equalsIgnoreCase(str2d)){
				
							book.date=str1d;
							System.out.println("�޸ĳɹ�������");
							System.out.println("�޸ĺ��ͼ��Ϊ"+book);
							
						}
					}else if("E".equalsIgnoreCase(s)){
						//������һ��
						flag1 = false;
						flag3 = false;
						flag2 = true;
						
						break;
						
					}else{
						System.out.println("����ѡ������������ѡ��");
					}
				}//while end
				
					
				}
					
					
			// if end
		if(flag2){
			break;
		}
			
		}//while end
		if(flag3){
			
			System.out.println("������������������������");
		}
	
	}//while end

		
   }//end
}//end





