package arrayList;

import java.util.ArrayList;

public class ArrayListTOArray {
	public static void main(String[] args) {
		/*ArrayList declaration and initialization*/
		ArrayList<String> arrlist= new ArrayList<String>();
		arrlist.add("String1");
		arrlist.add("String2");
		arrlist.add("String3");
		arrlist.add("String4");

		/*ArrayList to Array Conversion */
	   String[] arr= new String[arrlist.size()];
	   for(int i=0;i<arrlist.size();i++) {
		   arr[i]= arrlist.get(i);
	   }
	/*new Array*/
	  System.out.println(arr.toString());
	 for(String j:arr) {
		 System.out.println(j);
	 }
	}
	
}
