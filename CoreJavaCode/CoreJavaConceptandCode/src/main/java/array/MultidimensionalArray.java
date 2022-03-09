package array;

public class MultidimensionalArray {
public static void main(String[] args) {
	int[][] a = {
		      {1, 2, 3}, 
		      {4, 5, 6, 9}, 
		      {7}, 
		};
    int search[];
	System.out.println("Zero index :" + a[0].length);
	for(int i=0; i<a[0].length;i++) {
		System.out.println(a[i]);
	}
}
}
