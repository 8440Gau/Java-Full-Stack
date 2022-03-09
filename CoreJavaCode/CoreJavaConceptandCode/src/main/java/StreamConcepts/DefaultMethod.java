package StreamConcepts;

public class DefaultMethod implements myinterface{
public static void main(String[] args) {
	DefaultMethod d = new DefaultMethod();
	d.existingMethod("hello");
	d.newMethod();
   }

@Override
public void existingMethod(String str) {
	// TODO Auto-generated method stub
	
}
}

interface myinterface{
	/* This is a default method so we need not
     * to implement this method in the implementation 
     * classes  
     */
default void newMethod(){  
System.out.println("Newly added default method");  
    }  
/* Already existing public and abstract method
     * We must need to implement this method in 
     * implementation classes.
     */
void existingMethod(String str);  

}