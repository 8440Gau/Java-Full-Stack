package com.person.learning.Inheritance;

public class OverloadingPromotion {
	public void methodOne(int i)
	{
	System.out.println("int-arg method");
	}
	public void methodOne(float f) //overloaded methods
	{
	System.out.println("float-arg method");
	}
	public static void main(String[] args)
	{
	OverloadingPromotion o = new OverloadingPromotion();
	o.methodOne('a');
	o.methodOne(100);
	//o.methodOne(10.5);
	
	}
}
