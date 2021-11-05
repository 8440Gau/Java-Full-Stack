package conversion;

public class InttoStringWithoutinBuiltFunction {
public static void main(String[] args) {
	InttoStringWithoutinBuiltFunction builtFunction= new InttoStringWithoutinBuiltFunction();
	String s="123";
  builtFunction.change(s);
	
}
public static void change(String s) {
	int num=0;
	int n =s.length();
	for(int i=0;i<n;i++)
	//num=num*10+(int(s).charAt(i-48));
	System.out.println(num);
}

}
