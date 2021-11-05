package ToString;

public class Test {
private int i;
	Test(int i){
	this.i=i;
	
}
	public int hashcode(){
		return i;
	}
	public static void main(String[] args) {
		Test t= new Test(10);
		System.out.println(t);
	}
	@Override
	public String toString() {
		return "Test [i=" + i + "]";
	}
	
}
