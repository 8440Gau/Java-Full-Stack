package com.person.learning.Inheritance;

public class InhertanceDemo1 {
public static void main(String[] args) {
	Parent p1= new child();
	p1.m1();
	//p1.m2();
	child c1=new child();
	c1.m2();
	c1.m1();
	
}
}

class Parent{
	public void m1() {
		System.out.println("i am parent");
	}
}
class child extends Parent{
	public void m2() {
		System.out.println("i am child");
	}
}