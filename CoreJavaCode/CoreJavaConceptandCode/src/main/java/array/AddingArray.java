package array;

public class AddingArray {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 9 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = arr[i] + sum;

		}
		System.out.println("sum :" +sum);

		System.out.println("========");
		int a[] = { 18, 2, 8, 12, 10, 10, 9, 11, 20 };
		int max = a[0];
		System.out.println(a[0]);
		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[0]) {
				System.out.println("in");
				max = a[i];
				System.out.println("max :"+ max);
			}
		}
		System.out.println("*********************");
		int b[] = { 18, 2, 8, 12, 10, 10, 9, 11, 20 };
		int min= b[0];
		for(int j=1;j<b.length;j++) {
			if(b[j]<min) {
			min=b[j];
			}	
		}
		System.out.println("min :"+min);
	}
}
