package library;
//���������
public class Book {
	String name;
	String author;
	String company;
	String date;
	int bookNum;
	public Book(String name,String author,String company,String date,int bookNum){
		this.name = name;
		this.author = author;
		this.company = company;
		this.date = date;
		this.bookNum = bookNum;
	}
	public String toString(){
		return "  {����"+this.name+"   ����"+this.author+"   ������"+this.company+"   ��������"+this.date+"   ���"+this.bookNum+"}\n";
	}

}
