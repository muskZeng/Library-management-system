package library;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;










//这是主函数********************************************
public class Main {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("****************************************************************");
		System.out.println("*                                                              *");
		System.out.println("*                                                              *");
		System.out.println("**********************欢迎使用MJ智能图书管理系统 *****************");
		System.out.println("*                                                              *");
		System.out.println("*                                                              *");
		System.out.println("****************************************************************");
		
		//MyComparator comparator = new MyComparator();//比较器
		Users u1 = new  Users("123","123");
		Users u2= new  Users("456","456");
		Users u3 = new  Users("789","789");
		u1.add(u1);
		u1.add(u2);
		u1.add(u3);
		Users u = null;
		
		
		Admin a = new Admin("admin","admin");
		a.add(a);
		
		//TreeSet<Book> tree = new TreeSet<Book>(comparator);//保存图书
		ArrayList<Book> tree = new ArrayList<Book>();
		MemoryBook.memoryBook(tree);//增加图书
		
		
		while(true){
			
			System.out.println("\n \n                            请输入选择：A(注册)   B(登入)  C(退出智能系统)");
			String  s = scanner.next();
			if("b".equalsIgnoreCase(s)){
				
				enter(u,tree);
				
			}else if("a".equalsIgnoreCase(s)){
				
				enroll(u);//传入单列集合  注册页面
				
			}else if("c".equalsIgnoreCase(s)){
				
				break;//退出系统
				
			}else{
				
				System.out.println("你的输入有误，请重新输入");
				
			}
		}
	}//end
	
	
	
	
	
	
	
	public static void enroll(Users u){//注册页面
	
		System.out.println("注册新用户");
		while(true){
			
			
			String id;
			String password;
			while(true){
				System.out.println("请输入用户名(不能以数字开头，由数字、字母5-11位的元素组成)");
				id = scanner.next();
				String str1 = "[a-zA-Z][a-zA-Z0-9]{5,11}";
				if(id.matches(str1)){
					break;
				}else{
					System.out.println("你输入的ID账号不对，请重新输入");
				}
			}//while end
			
			while(true){
				System.out.println("请输入密码(不能以数字开头，由数字、字母元素组成(至少6位))");
				password = scanner.next();
				String str2 = "[a-zA-Z][a-zA-Z0-9]{6,}";
				if(password.matches(str2)){
					break;
				}else{
					System.out.println("你输入的密码格式不正确，请重新输入");
				}
			}//while end
			
			u = new Users(id,password);
			
			if(!u.add(u)){
				System.out.println("你注册的用户已经存在，请重新注册");
			}else{
				System.out.println("恭喜你注册MJ智能系统成功");
				break;
			}
		}
		
	}//end
	
	
	
	//登入界面
	public static void enter(Users u,ArrayList tree){
		System.out.println("用户登入");
		boolean flag = true;
		while(flag){
			System.out.println("请选择     A(普通用户登入)     B(管理员登入)");
			String str = scanner.next();
			if("a".equalsIgnoreCase(str)){
				//普通用户登入
				while(true){
					
					System.out.println("请输入id");
					String id = scanner.next();
					System.out.println("请输入密码");
					String password = scanner.next();
					u = new Users(id,password);
					if(u.contains(u)){
						System.out.println("登入成功");
						UserLibrary user = new UserLibrary();
						user.userLibrary(tree);
						flag = false;
						break;
					}else{
						System.out.println("登入失败，请重新登入");
					}
				}//while 循环
				
			}else if("b".equalsIgnoreCase(str)){
				//管理员登入
                while(true){
					
					System.out.println("请输入id");
					String id = scanner.next();
					System.out.println("请输入密码");
					String password = scanner.next();
					Admin a = new Admin(id,password);
					
					if(a.contains(a)){
						System.out.println("登入成功");
						AdminLibrary admin = new AdminLibrary();
						admin.userLibrary(tree);
						flag = false;
						break;
					}else{
						System.out.println("登入失败，请重新登入");
					}
				}//while 循环
				
			}else{
				System.out.println("你的选择有误,请重新选择");
			}
			
		}//while end	
		
		
		
		
	}// enter end
	
	
	
	
	

} //main end








