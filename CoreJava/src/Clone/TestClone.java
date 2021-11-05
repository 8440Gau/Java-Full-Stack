package Clone;

public class TestClone implements Cloneable {
	int i=20;
	int j=30;
	public static void main(String[] args) throws CloneNotSupportedException{
		TestClone clone= new TestClone();
		TestClone t2 = (TestClone) clone.clone();
		t2.i=88;
		t2.j=99;
		System.out.println("clone.i "+clone.i+"..... t2.clone"+ t2.i);
		System.out.println("clone.j :"+clone.j +"... t2.j"+ t2.j);
		
	}

}
