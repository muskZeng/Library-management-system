package library;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;










//����������********************************************
public class Main {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("****************************************************************");
		System.out.println("*                                                              *");
		System.out.println("*                                                              *");
		System.out.println("**********************��ӭʹ��MJ����ͼ�����ϵͳ *****************");
		System.out.println("*                                                              *");
		System.out.println("*                                                              *");
		System.out.println("****************************************************************");
		
		//MyComparator comparator = new MyComparator();//�Ƚ���
		Users u1 = new  Users("123","123");
		Users u2= new  Users("456","456");
		Users u3 = new  Users("789","789");
		u1.add(u1);
		u1.add(u2);
		u1.add(u3);
		Users u = null;
		
		
		Admin a = new Admin("admin","admin");
		a.add(a);
		
		//TreeSet<Book> tree = new TreeSet<Book>(comparator);//����ͼ��
		ArrayList<Book> tree = new ArrayList<Book>();
		MemoryBook.memoryBook(tree);//����ͼ��
		
		
		while(true){
			
			System.out.println("\n \n                            ������ѡ��A(ע��)   B(����)  C(�˳�����ϵͳ)");
			String  s = scanner.next();
			if("b".equalsIgnoreCase(s)){
				
				enter(u,tree);
				
			}else if("a".equalsIgnoreCase(s)){
				
				enroll(u);//���뵥�м���  ע��ҳ��
				
			}else if("c".equalsIgnoreCase(s)){
				
				break;//�˳�ϵͳ
				
			}else{
				
				System.out.println("���������������������");
				
			}
		}
	}//end
	
	
	
	
	
	
	
	public static void enroll(Users u){//ע��ҳ��
	
		System.out.println("ע�����û�");
		while(true){
			
			
			String id;
			String password;
			while(true){
				System.out.println("�������û���(���������ֿ�ͷ�������֡���ĸ5-11λ��Ԫ�����)");
				id = scanner.next();
				String str1 = "[a-zA-Z][a-zA-Z0-9]{5,11}";
				if(id.matches(str1)){
					break;
				}else{
					System.out.println("�������ID�˺Ų��ԣ�����������");
				}
			}//while end
			
			while(true){
				System.out.println("����������(���������ֿ�ͷ�������֡���ĸԪ�����(����6λ))");
				password = scanner.next();
				String str2 = "[a-zA-Z][a-zA-Z0-9]{6,}";
				if(password.matches(str2)){
					break;
				}else{
					System.out.println("������������ʽ����ȷ������������");
				}
			}//while end
			
			u = new Users(id,password);
			
			if(!u.add(u)){
				System.out.println("��ע����û��Ѿ����ڣ�������ע��");
			}else{
				System.out.println("��ϲ��ע��MJ����ϵͳ�ɹ�");
				break;
			}
		}
		
	}//end
	
	
	
	//�������
	public static void enter(Users u,ArrayList tree){
		System.out.println("�û�����");
		boolean flag = true;
		while(flag){
			System.out.println("��ѡ��     A(��ͨ�û�����)     B(����Ա����)");
			String str = scanner.next();
			if("a".equalsIgnoreCase(str)){
				//��ͨ�û�����
				while(true){
					
					System.out.println("������id");
					String id = scanner.next();
					System.out.println("����������");
					String password = scanner.next();
					u = new Users(id,password);
					if(u.contains(u)){
						System.out.println("����ɹ�");
						UserLibrary user = new UserLibrary();
						user.userLibrary(tree);
						flag = false;
						break;
					}else{
						System.out.println("����ʧ�ܣ������µ���");
					}
				}//while ѭ��
				
			}else if("b".equalsIgnoreCase(str)){
				//����Ա����
                while(true){
					
					System.out.println("������id");
					String id = scanner.next();
					System.out.println("����������");
					String password = scanner.next();
					Admin a = new Admin(id,password);
					
					if(a.contains(a)){
						System.out.println("����ɹ�");
						AdminLibrary admin = new AdminLibrary();
						admin.userLibrary(tree);
						flag = false;
						break;
					}else{
						System.out.println("����ʧ�ܣ������µ���");
					}
				}//while ѭ��
				
			}else{
				System.out.println("���ѡ������,������ѡ��");
			}
			
		}//while end	
		
		
		
		
	}// enter end
	
	
	
	
	

} //main end








