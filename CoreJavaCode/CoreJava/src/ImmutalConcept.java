
public final class ImmutalConcept {
private final int i;

public ImmutalConcept(int i) {
	super();
	this.i = i;
}
public ImmutalConcept modify(int i) {
	if(this.i==i)
		return this;
		else
			return (new ImmutalConcept(i));
	
}
public static void main(String[] args) {
	ImmutalConcept i = new ImmutalConcept(10);
	System.out.println(i);
	System.out.println("00000");
	ImmutalConcept i2= i.modify(100);
	System.out.println(i==i2);
	System.out.println("i.equals(i2): " +i.equals(i2));
}
}
