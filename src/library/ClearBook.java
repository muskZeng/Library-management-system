package library;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ClearBook {
	Scanner scanner = new Scanner(System.in);
	public void clearBook(ArrayList tree){
		
		System.out.println("删除图书");
		System.out.println("当前的图书如下");
		System.out.println(tree);
		boolean flag = false;
		boolean flag2 = false;
		boolean flag3 = true;
		while(true){
			
			System.out.println("请选择删除的方式：A(按照书号删除)  B(按照书名删除)   C(按照作者删除)");
			String str = scanner.next();
			if("a".equalsIgnoreCase(str)){
			while(true){
				
				System.out.println("请输入书号进行删除");
				int i = scanner.nextInt();
				Iterator<Book> it = tree.iterator();
				
				while(it.hasNext()){                       // 简直是神来之笔啊
					Book book = it.next();
					if(book.bookNum==i){
						System.out.println(book);
						System.out.println("是否删除此书： Y(是)   N(否)");
						String s = scanner.next();
						if("y".equalsIgnoreCase(s)){
							tree.remove(book);
							System.out.println("删除成功");
							flag = true;
							flag2 = true;
							flag3 = false;
							break;
						}else if("n".equalsIgnoreCase(s)){
							System.out.println("删除失败");
							flag = true;
							flag2 = true;
							flag3 = false;
							break;
						}else{
							System.out.println("你输入的书号不存在请重新输入");
						}
						
					}
				}//while end
				if(flag3){
					
					System.out.println("你输入的书名不存在请重新输入");
				}
				if(flag2){
					break;
				}
				
			}//while end	
			}else if("B".equalsIgnoreCase(str)){
				while(true){
					
					System.out.println("请输入书名进行删除\n");
					String n = scanner.next();
					Iterator<Book> it = tree.iterator();
					
					while(it.hasNext()){                       // 简直是神来之笔啊
						Book book = it.next();
						if(n.equals(book.name)){
							System.out.println(book);
							System.out.println("是否删除此书： Y(是)   N(否)");
							String s = scanner.next();
							if("y".equalsIgnoreCase(s)){
								tree.remove(book);
								System.out.println("删除成功");
								flag = true;
								flag2 = true;
								flag3 = false;
								break;
							}else if("n".equalsIgnoreCase(s)){
								System.out.println("删除失败");
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
						
						System.out.println("你输入的书名不存在请重新输入");
					}
					if(flag2){
						break;
					}
				}//while end
				
			}else if("c".equalsIgnoreCase(str)){
				while(true){
					
					System.out.println("请输入作者名字进行删除\n");
					String n = scanner.next();
					Iterator<Book> it = tree.iterator();
					
					while(it.hasNext()){                       // 简直是神来之笔啊
						Book book = it.next();
						if(n.equals(book.author)){
							System.out.println(book);
							System.out.println("是否删除此书： Y(是)   N(否)\n");
							String s = scanner.next();
							if("y".equalsIgnoreCase(s)){
								tree.remove(book);
								System.out.println("删除成功");
								flag = true;
								flag2 = true;
								flag3 = false;
								break;
							}else if("n".equalsIgnoreCase(s)){
								System.out.println("删除失败");
								flag = true;
								flag2 = true;
								flag3 = false;
								break;
							}else{
							}
							
						}
					}//while end
					if(flag3){
						
						System.out.println("你输入的作者名不存在请重新输入");
					}
					if(flag2){
						break;
					}
				}//while end
			}else{
				System.out.println("你输入的选择有误，请重新输入");
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
			System.out.println("是否删除"+book.name+"?"+"Y(是)   N(否)");
			String s = scanner.next();
			if("y".equalsIgnoreCase(s)){
				tree.remove(book);
				System.out.println("删除图书成功");
				flag=false;
				break;
			 }else if("n".equalsIgnoreCase(s)){
				 flag=true;
			 }
			
		}//while end
		
		if(flag){
			
			System.out.println("删除图书失败");
		}
		
		*/

		
	}

}
