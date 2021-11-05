package lambdaExpression;

public class Test2 {
public static void main(String[] args) {
 i2 i = () -> System.out.println("aaa");
i.m1();

}
}

interface i2{
	public void m1();
}