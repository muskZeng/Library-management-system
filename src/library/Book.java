package library;
//这是书的类
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
		return "  {书名"+this.name+"   作者"+this.author+"   出版社"+this.company+"   出版日期"+this.date+"   书号"+this.bookNum+"}\n";
	}

}
