package array;

import java.util.Arrays;

public class Copying {
public static void main(String[] args) {
	 int arr[] = {12,67,89,43,65};
	 int copy[] = new int[arr.length];
	 int i=0;
	 for(i=0;i<arr.length;i++) {
		 copy[i]=arr[i];
	 }
	 System.out.println(Arrays.toString(copy));
}
}
