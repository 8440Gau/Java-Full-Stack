package lambdaExpression;



public class Test {
public static void main(String[] args) {
I1 i= new Demo();
i.m1();
}
}
interface I1{
public void m1();
}
class Demo implements I1{
	

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
}