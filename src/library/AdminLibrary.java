package library;
//这是图书管理员的增删改查的系统
import java.util.ArrayList;
import java.util.Scanner;

public class AdminLibrary {
	Scanner scanner = new Scanner(System.in);
	public void userLibrary(ArrayList tree){
		System.out.println("欢迎使用MJ智能操作图书       请选择您的操作：");
		while(true){
			
			System.out.println("A(查看图书) B(增加图书)  C(删除图书) D(修改图书)E(注销本用户) F(删除用户)  G(查看所有的用户)H(修改ID与密码)");
			String s = scanner.next();
			
			if("a".equalsIgnoreCase(s)){
				//查看
				LookBook look = new LookBook();
				look.lookBook(tree);
				
			}else if("b".equalsIgnoreCase(s)){
				//增加
				AddBook add = new AddBook();
				add.addBook(tree);
				
			}else if("c".equalsIgnoreCase(s)){
				//删除
				ClearBook clear = new ClearBook();
				clear.clearBook(tree);
			}else if("d".equalsIgnoreCase(s)){
				//修改
				ReviseBook setBook = new ReviseBook();
				setBook.reviseBook(tree);
			}else if("e".equalsIgnoreCase(s)){
				//注销
				break;
				
			}else if("f".equalsIgnoreCase(s)){
				//账号删除
				Users.clearUser();
				
			}else if("g".equalsIgnoreCase(s)){
				//查看用户
				Users.lookUser();
			}else if("h".equalsIgnoreCase(s)){
				//修改ID 与密码
				Users.reviseUser();
			}else{
				System.out.println("你的选择有误，请重新输入");
			}
			
			
			
		}//while end
		
		
	}// fangfa end
	
	

}//end
