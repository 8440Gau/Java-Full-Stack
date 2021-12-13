package StreamConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingUsingCompartor {
public static void main(String[] args) {
	List<Employee> list = new ArrayList<Employee>();
	list.add(new Employee("101","Gaurav","10000"));
	list.add(new Employee("104","Saurabh","10231"));
	list.add(new Employee("105","AMit","12000"));
	list.add(new Employee("109","Bikky","13400"));
	list.add(new Employee("108","Sujit","14200"));
	list.add(new Employee("106","Makhan","19834"));
	list.add(new Employee("102","Butter","12871"));
	
	//convert list into stream
	
  Stream s=  list.stream();
  s.forEach(a->System.out.println(a));
}
}