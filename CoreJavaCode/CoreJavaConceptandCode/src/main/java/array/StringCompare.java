package array;

public class StringCompare {
public static void main(String[] args) {
	int[] a= {1,2,3};
	int[] b= {4,1,5};
	
	for(int i=0;i<a.length;i++) {
		for(int i1=0;i<b.length;i1++) {
			if(a[i]==b[i1]) {
				System.out.println("found :" +a[i]);
			}
		}
	}
}
}
