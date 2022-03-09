package equalsmethod;

public class EqualMethod {
	String name;
	String rolln;

	public EqualMethod(String name, String ro) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.rolln = ro;
	}

	@Override
	public String toString() {
		return "EqualMethod [name=" + name + ", rolln=" + rolln + "]";
	}

	public static void main(String[] args) {
		EqualMethod e1 = new EqualMethod("vijayabhaskar", "101");
		EqualMethod e3 = new EqualMethod("vijayabhaskar", "101");
		String s1= new String("A");
		String s2= new String("B");
		System.out.println("****");
		System.out.println(" s1==s2 :" + s1==s2);
		System.out.println("&&&&&&&&&&&&&");
		System.out.println("s1.equalss2 :" + s1.equals(s2));
		System.out.println("*********");
		System.out.println(e1);
		EqualMethod e2 = new EqualMethod("E1", "1");
		EqualMethod e4 = e1;

		System.out.println("equal method " + e1.equals(e2));
		System.out.println(" == " + (e1 == e2));

		System.out.println("e3.equal(e1) +" + e3.equals(e1));
		System.out.println("e3==e1" + (e3 == e1));
		System.out.println("e4==e1 via equal method  :" + e4.equals(e1));
	}

}
