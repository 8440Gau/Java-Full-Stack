package comparaabl3evscomparator;

public class BasicComparableUnderstanding {
public static void main(String[] args) {
	 Integer valA = Integer.valueOf(45);
     Integer valB = Integer.valueOf(99);
     
     int comparisonA = valA.compareTo(valB);
     int compareB = valB.compareTo(valA);
     
     System.out.println("comparisonA " + comparisonA);
     System.out.println("comparisonB " + compareB);
}
}
