package EqualMethod;


public class EqualMethodWithoutOverriding {
	String name;
	int rollno;
	public EqualMethodWithoutOverriding(String name1, int rollno1 ) {
		// TODO Auto-generated constructor stub
		this.name= name1;
		this.rollno=rollno1;
	}
public static void main(String[] args) {
	EqualMethodWithoutOverriding e1 = new EqualMethodWithoutOverriding("vijay", 101);
	EqualMethodWithoutOverriding e2 = new EqualMethodWithoutOverriding("gaurav", 102);
	EqualMethodWithoutOverriding e3 = new EqualMethodWithoutOverriding("vijay", 101);
	EqualMethodWithoutOverriding e4 = e1;
	System.out.println(e1.equals(e2));
	System.out.println(e2.equals(e3));
	System.out.println(e1.equals(e4));
	
}
}
