package lambdaExpression;

public class LambdaSquare {
public static void main(String[] args) {
	i5 i= (s)-> System.out.println( s*s);
	i.square(5);
}
}

interface i5{
	public void square(int s);
}