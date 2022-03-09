package DesignPattern;

public class InterfaceCheck {
public static void main(String[] args) {
	MyInterface s = new InterfaceExample();
	s.demo();
}
}

interface MyInterface{
	   public static final int num = 30;
	   public abstract void demo();
	}
	 class InterfaceExample implements MyInterface {
	   public void demo() {
	      System.out.println("This is the implementation of the demo method");
	   }
	 }