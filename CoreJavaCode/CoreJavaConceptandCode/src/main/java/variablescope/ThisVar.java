package variablescope;

public class ThisVar {
	final static int a=12;
public static void main(String[] args) {
	ThisVar thisVar= new ThisVar();
	thisVar.scope();
}
public void scope() {
	int a=10;
	System.out.println(this.a);
}
}
