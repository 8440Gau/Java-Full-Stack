package array;

public class SumofArray {
public static void main(String[] args) {
	SumofArray array = new SumofArray();
	array.sum();
}
static int arr[] = {12,67,89,43,65};
int sum=0;
public void sum() {
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
	}
	System.out.println(sum);
}
}
