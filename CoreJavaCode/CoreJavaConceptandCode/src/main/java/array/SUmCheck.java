package array;


public class SUmCheck {
	static int count =0;
public static void main(String[] args) {
	int b[] = { 18, 2, 8, 12, 10, 10, 9, 11, 20 };
	int max1= b[0];
	int sum;
	for(int i=0;i<b.length;i++) {
		for(int j=0;j<b.length;j++) {
		if(i!=j) {
			if(b[i]+b[j]==20) {
				count++;
				
			}
		}
			
		}
		/*sum=max1+b[i];
		if(sum==20) {
			count++;
			System.out.println("in :" + count);
		}*/
	}
	System.out.println("the count is :"+ count++);
}
}
