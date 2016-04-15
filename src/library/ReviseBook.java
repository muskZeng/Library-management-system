package library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ReviseBook{
	Scanner scanner = new Scanner(System.in);
	public void reviseBook(ArrayList tree){
		System.out.println("进入修改图书智能系统");
		System.out.println("当前的图书信息如下：");
		Collections.sort(tree,new MyComparator2());
		System.out.println(tree);
		boolean flag1 = true;
		boolean flag3 = true;
	while(flag1){
		System.out.println("请输入要修改的书号");
		int i = scanner.nextInt();
		
		Iterator<Book> it = tree.iterator();
		
		boolean flag2 = false;
		while(it.hasNext()){                       // 简直是神来之笔啊
			
			Book book = it.next();
			if(book.bookNum==i){
				System.out.println(book);
				while(true){
					System.out.println("请选择要修改的属性：A(书名)  B(作者)  C(出版社) D(出版日期) E(返回上一级菜单)");
					String s = scanner.next();
					if("a".equalsIgnoreCase(s)){
						//书名修改
						System.out.println("请输入修改的书名");
						String str1a = scanner.next();
						System.out.println("是否保存修改后的内容：Y(是)   N(否)");
						String str2a = scanner.next();
						if("y".equalsIgnoreCase(str2a)){
				
							book.name=str1a;
							System.out.println("修改成功！！！");
							System.out.println("修改后的图书为"+book);
							
						}
						
						
					}else if("b".equalsIgnoreCase(s)){
						//作者修改
						System.out.println("请输入修改的作者");
						String str1b = scanner.next();
						System.out.println("是否保存修改后的内容：Y(是)   N(否)");
						String str2b = scanner.next();
						if("y".equalsIgnoreCase(str2b)){
				
							book.author=str1b;
							System.out.println("修改成功！！！");
							System.out.println("修改后的图书为"+book);
							
						}
					}else if("c".equalsIgnoreCase(s)){
						//出版社修改
						System.out.println("请输入出版社");
						String str1c = scanner.next();
						System.out.println("是否保存修改后的内容：Y(是)   N(否)");
						String str2c = scanner.next();
						if("y".equalsIgnoreCase(str2c)){
				
							book.company=str1c;
							System.out.println("修改成功！！！");
							System.out.println("修改后的图书为"+book);
							
						}
					}else if("d".equalsIgnoreCase(s)){
						//出版日期修改
						System.out.println("请输入修改的日期");
						String str1d = scanner.next();
						System.out.println("是否保存修改后的内容：Y(是)   N(否)");
						String str2d = scanner.next();
						if("y".equalsIgnoreCase(str2d)){
				
							book.date=str1d;
							System.out.println("修改成功！！！");
							System.out.println("修改后的图书为"+book);
							
						}
					}else if("E".equalsIgnoreCase(s)){
						//返回上一级
						flag1 = false;
						flag3 = false;
						flag2 = true;
						
						break;
						
					}else{
						System.out.println("您的选择有误，请重新选择");
					}
				}//while end
				
					
				}
					
					
			// if end
		if(flag2){
			break;
		}
			
		}//while end
		if(flag3){
			
			System.out.println("您输入的书号有误，请重新输入");
		}
	
	}//while end

		
   }//end
}//end





