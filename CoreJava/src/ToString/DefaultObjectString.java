package ToString;

public class DefaultObjectString {
	private String name;
	 private String rollno;
	public DefaultObjectString(String name1,String rollno1) {
		// TODO Auto-generated constructor stub
		this.name= name1;
		this.rollno=rollno1;
		
		
	}
public static void main(String[] args) {
DefaultObjectString defaultObjectString = new DefaultObjectString("S", "1-1");
DefaultObjectString defaultObjectString1 = new DefaultObjectString("S1", "1-1-1");
	System.out.println(defaultObjectString.toString());
}
@Override
public String toString() {
	return "DefaultObjectString [name=" + name + ", rollno=" + rollno + "]";
}

}
