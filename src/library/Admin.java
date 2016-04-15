package library;

import java.util.HashSet;

public class Admin {
	String id;
	String password;
	static HashSet<Admin> set = new HashSet<Admin>();//¼ÇÂ¼ÕËºÅ
	
	public Admin(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	public void add(Admin u1){
		set.add(u1);
	} 
	
	
	
	
	public boolean contains(Admin u2){
		
		return set.contains(u2);
		
	}
	
	
	public boolean equals(Object o){
		Admin user = (Admin)o;
		return this.id.hashCode()==user.id.hashCode();
	}
	public int hashCode(){
		return this.id.hashCode();
	}
	@Override
		public String toString() {
			
			return "{ id£º"+this.id+"  "+"ÃÜÂë£º"+this.password+"}";
		}
	
	
}
