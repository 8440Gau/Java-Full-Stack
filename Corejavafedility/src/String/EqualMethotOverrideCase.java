package String;

public class EqualMethotOverrideCase {
	String name;
	int rollno;

	EqualMethotOverrideCase(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
	
/*
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}*/
	public boolean equals(Object o) {
		if(this==o)
		return true;
		if(o instanceof EqualMethotOverrideCase) {
			EqualMethotOverrideCase s2=(EqualMethotOverrideCase)o;
		if(name.equals(s2.name) && rollno==s2.rollno)
		return true;
		else
		return false;
		}
		return false;
		}

	public static void main(String[] args) {
		EqualMethotOverrideCase e1= new EqualMethotOverrideCase("vijayabhaskar",101);
		EqualMethotOverrideCase e2= new EqualMethotOverrideCase("bhaskar",102);
		EqualMethotOverrideCase e3= new EqualMethotOverrideCase("vijayabhaskar",101);
		EqualMethotOverrideCase e4=e1;
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));
	}
}
