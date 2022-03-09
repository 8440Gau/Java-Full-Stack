package array;

public class StringReverse {
public static void main(String[] args) {
	StringReverse s = new StringReverse();
	s.reverseString();
}
public void reverseString() {
	String s="hello",revString = "";
	char ch;
	
	for(int i=0; i<s.length();i++) {
		ch= s.charAt(i);
		//revString = revString+ch;
	}
	System.out.println(revString);
}
}

/*
The task is to count all the triplets such that sum of two elements equals the third element.
arr[] = {1, 5, 3, 2}
Output: 2
Explanation: There are 2 triplets:
1 + 2 = 3 and 3 +2 = 5
arr[] = {2, 3, 4}
Output: 0
Explanation: No such triplet exits*/