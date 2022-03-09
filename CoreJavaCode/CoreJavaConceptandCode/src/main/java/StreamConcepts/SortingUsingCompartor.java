package StreamConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingUsingCompartor {
public static void main(String[] args) {
	List<Employee> list = new ArrayList<Employee>();
/*	list.add(new Employee("101","Gaurav","10000","1001","25"));
	list.add(new Employee("104","Saurabh","10231","",""));
	list.add(new Employee("105","AMit","12000","",""));
	list.add(new Employee("109","Bikky","13400","",""));
	list.add(new Employee("108","Sujit","14200","",""));
	list.add(new Employee("106","Makhan","19834","",""));
	list.add(new Employee("102","Butter","12871","",""));*/
	
	list.add(new Employee("1", "Gaurav", "100000", "1001", "24"));
	list.add(new Employee("2", "Gau", "10760", "2002", "26"));
	list.add(new Employee("3", "Saurabh", "21345", "6588", "18"));
	list.add(new Employee("4", "Hello", "32145", "6548", "23"));
	list.add(new Employee("5", "Hii", "65432", "7689", "24"));
	//convert list into stream
	
  Stream s=  list.stream();
  s.forEach(a->System.out.println(a));
  
  
  List<String> s1= (List<String>) list.stream().distinct();
  s1.forEach(a->System.out.println(a));
  
}
}