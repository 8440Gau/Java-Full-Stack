package lambdaExpression;

public class LambdaAddFunction {
public static void main(String[] args) {
	i3 i=(a,b)-> System.out.println(a+b);
	i.add(10, 20);
}
}

interface i3{
	public void add(int a, int b);
}