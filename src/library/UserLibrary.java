package library;
//������ͨ�û�����ɾ�Ĳ��ϵͳ
import java.util.ArrayList;
import java.util.Scanner;

public class UserLibrary {
	Scanner scanner = new Scanner(System.in);
	public void userLibrary(ArrayList tree){
		System.out.println("��ӭʹ��MJ���ܲ���ͼ��       ��ѡ�����Ĳ�����");
		while(true){
			
			System.out.println("A(�鿴ͼ��) B(����ͼ��)  C(ɾ��ͼ��)  D(�޸�ͼ��) E(�޸��˺�������) F(ע�����û�) ");
			String s = scanner.next();
			
			if("a".equalsIgnoreCase(s)){
				//�鿴
				LookBook look = new LookBook();
				look.lookBook(tree);
				
			}else if("b".equalsIgnoreCase(s)){
				//����
				AddBook add = new AddBook();
				add.addBook(tree);
				
			}else if("c".equalsIgnoreCase(s)){
				//ɾ��
				ClearBook clear = new ClearBook();
				clear.clearBook(tree);
			}else if("d".equalsIgnoreCase(s)){
				//�޸�
				ReviseBook setBook = new ReviseBook();
				setBook.reviseBook(tree);
			}else if("e".equalsIgnoreCase(s)){
				//�޸��û�ID��password
				
				Users.reviseUser();
				
			}else if("f".equalsIgnoreCase(s)){
				//ע��
				break;
				
			}else{
				System.out.println("���ѡ����������������");
			}
			
			
			
		}//while end
		
		
	}// fangfa end
	
	

}//end
