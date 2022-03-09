package revisionjava8;

public class OpsBasedonLambhaExpression {
public static void main(String[] args) {
	oppsop o= (int z,int x) -> System.out.println(z+x); ;
	o.ops(10, 20);
	System.out.println("SUb");
	oppsop o1=(int v,int n) -> System.out.println(v-n);
	o1.ops(100, 10);
			
}
}

@FunctionalInterface
interface oppsop{
	abstract void ops(int a, int b);
	
}