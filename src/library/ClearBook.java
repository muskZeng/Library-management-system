package library;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ClearBook {
	Scanner scanner = new Scanner(System.in);
	public void clearBook(ArrayList tree){
		
		System.out.println("ɾ��ͼ��");
		System.out.println("��ǰ��ͼ������");
		System.out.println(tree);
		boolean flag = false;
		boolean flag2 = false;
		boolean flag3 = true;
		while(true){
			
			System.out.println("��ѡ��ɾ���ķ�ʽ��A(�������ɾ��)  B(��������ɾ��)   C(��������ɾ��)");
			String str = scanner.next();
			if("a".equalsIgnoreCase(str)){
			while(true){
				
				System.out.println("��������Ž���ɾ��");
				int i = scanner.nextInt();
				Iterator<Book> it = tree.iterator();
				
				while(it.hasNext()){                       // ��ֱ������֮�ʰ�
					Book book = it.next();
					if(book.bookNum==i){
						System.out.println(book);
						System.out.println("�Ƿ�ɾ�����飺 Y(��)   N(��)");
						String s = scanner.next();
						if("y".equalsIgnoreCase(s)){
							tree.remove(book);
							System.out.println("ɾ���ɹ�");
							flag = true;
							flag2 = true;
							flag3 = false;
							break;
						}else if("n".equalsIgnoreCase(s)){
							System.out.println("ɾ��ʧ��");
							flag = true;
							flag2 = true;
							flag3 = false;
							break;
						}else{
							System.out.println("���������Ų���������������");
						}
						
					}
				}//while end
				if(flag3){
					
					System.out.println("���������������������������");
				}
				if(flag2){
					break;
				}
				
			}//while end	
			}else if("B".equalsIgnoreCase(str)){
				while(true){
					
					System.out.println("��������������ɾ��\n");
					String n = scanner.next();
					Iterator<Book> it = tree.iterator();
					
					while(it.hasNext()){                       // ��ֱ������֮�ʰ�
						Book book = it.next();
						if(n.equals(book.name)){
							System.out.println(book);
							System.out.println("�Ƿ�ɾ�����飺 Y(��)   N(��)");
							String s = scanner.next();
							if("y".equalsIgnoreCase(s)){
								tree.remove(book);
								System.out.println("ɾ���ɹ�");
								flag = true;
								flag2 = true;
								flag3 = false;
								break;
							}else if("n".equalsIgnoreCase(s)){
								System.out.println("ɾ��ʧ��");
								flag = true;
								flag2 = true;
								flag3 = false;
								break;
							}else{
								break;
							}
						}
						
					}//while end
					if(flag3){
						
						System.out.println("���������������������������");
					}
					if(flag2){
						break;
					}
				}//while end
				
			}else if("c".equalsIgnoreCase(str)){
				while(true){
					
					System.out.println("�������������ֽ���ɾ��\n");
					String n = scanner.next();
					Iterator<Book> it = tree.iterator();
					
					while(it.hasNext()){                       // ��ֱ������֮�ʰ�
						Book book = it.next();
						if(n.equals(book.author)){
							System.out.println(book);
							System.out.println("�Ƿ�ɾ�����飺 Y(��)   N(��)\n");
							String s = scanner.next();
							if("y".equalsIgnoreCase(s)){
								tree.remove(book);
								System.out.println("ɾ���ɹ�");
								flag = true;
								flag2 = true;
								flag3 = false;
								break;
							}else if("n".equalsIgnoreCase(s)){
								System.out.println("ɾ��ʧ��");
								flag = true;
								flag2 = true;
								flag3 = false;
								break;
							}else{
							}
							
						}
					}//while end
					if(flag3){
						
						System.out.println("�����������������������������");
					}
					if(flag2){
						break;
					}
				}//while end
			}else{
				System.out.println("�������ѡ����������������");
			}
			
			
			if(flag){
				break;
			}
			
			
		}/////while end
		
		
		/*
		Iterator<Book> it = tree.iterator();
		
		boolean flag = false;
		while(it.hasNext()){
			Book book = it.next();
			System.out.println("�Ƿ�ɾ��"+book.name+"?"+"Y(��)   N(��)");
			String s = scanner.next();
			if("y".equalsIgnoreCase(s)){
				tree.remove(book);
				System.out.println("ɾ��ͼ��ɹ�");
				flag=false;
				break;
			 }else if("n".equalsIgnoreCase(s)){
				 flag=true;
			 }
			
		}//while end
		
		if(flag){
			
			System.out.println("ɾ��ͼ��ʧ��");
		}
		
		*/

		
	}

}
