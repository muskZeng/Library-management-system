package library;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Users{      //�����û���
    static Scanner scanner = new Scanner(System.in);
	String id;
	String password;
	static HashSet<Users> set = new HashSet<Users>();//��¼�˺�
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
	//�鿴���е��û�
	public  static void lookUser(){
		System.out.println(set);
	}
	
	//ɾ���û�
	public static void clearUser(){
		System.out.println("��ǰ�������û����£�");
		lookUser();
		boolean flag = true;
		
		while(flag){
			System.out.println("������Ҫɾ�����˺ŵ�ID");
			String s1 = scanner.next();
			for(Users user:set){
				if(user.id.equals(s1)){
					System.out.println(user);
					System.out.println("�Ƿ�ɾ�����˺ţ�   A(��)       B(��)");
					String s2 = scanner.next();
					
					if("a".equalsIgnoreCase(s2)){
						set.remove(user);
						System.out.println("ɾ���ɹ�");
						flag = false;
						
						break;
					}else{
						flag = false;
						break;
					}
				}
				
			}//for end 
			if(flag){
				
				System.out.println("��������˺ŵ�id��������������");
			}
		}//while end
	}//end
	
	
	
	//�޸��û���������
	public static void reviseUser(){
		
		System.out.println("�����޸��û�����,��ǰ���û����£�");
		lookUser();
	
		boolean flag = true;
		boolean flag1 = true;
		boolean flag2 = true;
		while(flag){
			System.out.println("����������޸ĵ��˻�����");
			String i = scanner.next();
			
		
			Iterator<Users> it = set.iterator();
			while(it.hasNext()){                       // ��ֱ������֮�ʰ�
				
				Users user = it.next();
				if(user.id.equals(i)){
					System.out.println(user);
					while(flag1){
						System.out.println("��ѡ��Ҫ�޸ĵ����ԣ�A(ID)  B(����)  E(������һ��)");
						String s1 = scanner.next();
						if("a".equalsIgnoreCase(s1)){
							//ID�޸�
							System.out.println("�������޸ĵ�ID");
							String str1a = scanner.next();
							System.out.println("�Ƿ񱣴��޸ĺ�����ݣ�Y(��)   N(��) ");
							String str2a = scanner.next();
							if("y".equalsIgnoreCase(str2a)){
					
								user.id=str1a;
								System.out.println("�޸ĳɹ�������");
								System.out.println("�޸ĺ��ͼ��Ϊ"+user);
								
								
							}else{
								
							}
							
						}else if("b".equalsIgnoreCase(s1)){
							//�����޸�
							System.out.println("�������޸ĵ�����");
							String str1a = scanner.next();
							System.out.println("�Ƿ񱣴��޸ĺ�����ݣ�Y(��)   N(��)");
							String str2a = scanner.next();
							if("y".equalsIgnoreCase(str2a)){
					
								user.password=str1a;
								System.out.println("�޸ĳɹ�������");
								System.out.println("�޸ĺ��ͼ��Ϊ"+user);
								
								
								
							}else{
								
								
							}
							
						}else if("e".equalsIgnoreCase(s1)){
							flag1 = false;
							flag2 = false;
							flag = false;
							
						}else{
							System.out.println("���ѡ������������ѡ��");
						}
						
					}//while end
				}//if
				
			}//while end
			if(flag){
				
				System.out.println("�������ID�����ڣ�����������");
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
			
			return "{ id��"+this.id+"  "+"���룺"+this.password+"}";
		}
}
