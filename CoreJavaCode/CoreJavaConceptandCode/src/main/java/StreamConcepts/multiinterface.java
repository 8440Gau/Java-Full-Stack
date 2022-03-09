package StreamConcepts;

public class multiinterface implements i1,i2 {
public static void main(String[] args) {
	
}

@Override
public void m1() {
	// TODO Auto-generated method stub
	i1.super.m1();
}


}

interface i1{
	default void m1() {}
}
interface i2{
	default void m1() {}
}