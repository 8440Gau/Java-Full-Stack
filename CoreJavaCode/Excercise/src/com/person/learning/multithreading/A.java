package com.person.learning.multithreading;

public class A extends B{

	public void msg()
	{
		System.out.println("Hello java");
		}
 
	public static void main(String[] args) {
	B b1= new B();
	A a1= new A();
	a1.msg();
}
	
}
class B{
		protected void msg()
		{
			System.out.println("Hello java");
			}
}
