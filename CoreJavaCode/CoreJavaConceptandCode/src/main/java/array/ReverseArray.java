package array;

public class ReverseArray {
public static void main(String[] args) {
	int[] originalarr = {10,21,10,17,19};
	int[] reversearr = new int[originalarr.length];
	System.out.println("arr size :" +reversearr.toString());
	for(int i =0; i<originalarr.length;i++) {
		//System.out.println(i);
		System.out.println(originalarr[i]);
		reversearr[originalarr.length]= originalarr[i];
	   System.out.println("-========");
		System.out.println(reversearr[i]);
	}
//	System.out.println(reversearr[i]);	
}
}
