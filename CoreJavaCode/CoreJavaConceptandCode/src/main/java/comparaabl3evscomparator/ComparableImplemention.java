package comparaabl3evscomparator;

public class ComparableImplemention implements Comparable {
	private String localname=null;
	private String localreg=null;
	
	
	
public ComparableImplemention(String localconstname, String localconstreg) {
		super();
		this.localname = localconstname;
		this.localreg = localconstreg;
	}

public static void main(String[] args) {
	
}

@Override
public int compareTo(Object o) {
	ComparableImplemention other = (ComparableImplemention) o;
	
	int comapremethod = this.localname.compareTo(other.localname);
	if(comapremethod!=0) {
		return comapremethod;
	}
	
	return this.localreg.compareTo(other.localname);
}
}
