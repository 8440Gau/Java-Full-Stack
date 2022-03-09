package revisionjava8;

public class LambhaExpressionRevision1 {
public static void main(String[] args) {
	Function f= (int x) -> System.out.println(x*2);
	f.fun1(5);
}
}

@FunctionalInterface
interface Function{
	abstract void fun1(int x);
	default void fun2(String s) {
		System.out.println("Hello");
		return;
	}
}