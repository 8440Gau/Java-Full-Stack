package singleton;

public class SinglentonClassCreation {
	
public static void main(String[] args) {
	Single s= new Single();
	System.out.println(Single.getSingle().hashCode());
	System.out.println(Single.getSingle().hashCode());
}
}
class Single{
	
	private static String a="name";
	private static Single t=null;
  Single() {
	  
  }
  public static Single getSingle() {
	  if(t==null) {
		  t= new Single();
	  }
		  return t;
	  
  }
	
}