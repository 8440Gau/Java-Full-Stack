package inheritance;

import java.io.FileNotFoundException;

public class ExceptionConcept {
public static void main(String[] args) {
	
}
}

class A{
	public void file () throws FileNotFoundException{
		System.out.println("SOP");
	}
}
class B extends A{
	public void file() throws FileNotFoundException{
		System.out.println("SOP2");
	}
}