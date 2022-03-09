package DesignPattern;

public class SingletonclssCreation {
public static void main(String[] args) {
	SingleObject s = SingleObject.getInstance();
	s.msg();
	
	
}
}

 class SingleObject{
	private static SingleObject instance = new SingleObject();
	
	private SingleObject() {
		
	}
	
	public static SingleObject getInstance() {
		return  instance;
	}
	public void msg() {
		System.out.println("Singleton Class");
	}
}