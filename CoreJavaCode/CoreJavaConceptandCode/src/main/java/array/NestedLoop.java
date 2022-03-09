package array;

public class NestedLoop {
public static void main(String[] args) {
	for(int i=0;i<4;i++) {
		System.out.println("outer loop lets say its month's weeks :"+i );
		{
			for(int j=0;j<7;j++ ) {
				System.out.println("inner loop lets say its weeks days :"+j);
			}
		}
	}
}
}
