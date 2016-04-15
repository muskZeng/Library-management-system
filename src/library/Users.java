package library;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Users{      //建立用户类
    static Scanner scanner = new Scanner(System.in);
	String id;
	String password;
	static HashSet<Users> set = new HashSet<Users>();//记录账号
	public Users(String id,String password){
		this.id = id;
		this.password = password;
		
	}
	public boolean add(Users u1){
		return set.add(u1);
	} 
	public boolean contains(Users u2){
		return set.contains(u2);
	}
	//查看所有的用户
	public  static void lookUser(){
		System.out.println(set);
	}
	
	//删除用户
	public static void clearUser(){
		System.out.println("当前的所有用户如下：");
		lookUser();
		boolean flag = true;
		
		while(flag){
			System.out.println("请输入要删除的账号的ID");
			String s1 = scanner.next();
			for(Users user:set){
				if(user.id.equals(s1)){
					System.out.println(user);
					System.out.println("是否删除此账号？   A(是)       B(否)");
					String s2 = scanner.next();
					
					if("a".equalsIgnoreCase(s2)){
						set.remove(user);
						System.out.println("删除成功");
						flag = false;
						
						break;
					}else{
						flag = false;
						break;
					}
				}
				
			}//for end 
			if(flag){
				
				System.out.println("您输入的账号的id有误，请重新输入");
			}
		}//while end
	}//end
	
	
	
	//修改用户名和密码
	public static void reviseUser(){
		
		System.out.println("来到修改用户界面,当前的用户如下：");
		lookUser();
	
		boolean flag = true;
		boolean flag1 = true;
		boolean flag2 = true;
		while(flag){
			System.out.println("请输入你的修改的账户名：");
			String i = scanner.next();
			
		
			Iterator<Users> it = set.iterator();
			while(it.hasNext()){                       // 简直是神来之笔啊
				
				Users user = it.next();
				if(user.id.equals(i)){
					System.out.println(user);
					while(flag1){
						System.out.println("请选择要修改的属性：A(ID)  B(密码)  E(返回上一级)");
						String s1 = scanner.next();
						if("a".equalsIgnoreCase(s1)){
							//ID修改
							System.out.println("请输入修改的ID");
							String str1a = scanner.next();
							System.out.println("是否保存修改后的内容：Y(是)   N(否) ");
							String str2a = scanner.next();
							if("y".equalsIgnoreCase(str2a)){
					
								user.id=str1a;
								System.out.println("修改成功！！！");
								System.out.println("修改后的图书为"+user);
								
								
							}else{
								
							}
							
						}else if("b".equalsIgnoreCase(s1)){
							//密码修改
							System.out.println("请输入修改的密码");
							String str1a = scanner.next();
							System.out.println("是否保存修改后的内容：Y(是)   N(否)");
							String str2a = scanner.next();
							if("y".equalsIgnoreCase(str2a)){
					
								user.password=str1a;
								System.out.println("修改成功！！！");
								System.out.println("修改后的图书为"+user);
								
								
								
							}else{
								
								
							}
							
						}else if("e".equalsIgnoreCase(s1)){
							flag1 = false;
							flag2 = false;
							flag = false;
							
						}else{
							System.out.println("你的选择有误，请重新选择");
						}
						
					}//while end
				}//if
				
			}//while end
			if(flag){
				
				System.out.println("您输入的ID不存在，请重新输入");
			}
							
		}//while  end
		
		
		
	}//end
	
	
	
	
	
	
	
	public boolean equals(Object o){
		Users user = (Users)o;
		return this.id.hashCode()==user.id.hashCode();
	}
	public int hashCode(){
		return this.id.hashCode();
	}
	@Override
		public String toString() {
			
			return "{ id："+this.id+"  "+"密码："+this.password+"}";
		}
}
