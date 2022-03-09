package comparaabl3evscomparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Comparatorjava8 {
public static void main(String[] args) {
	List<Employee> emp = new ArrayList<Employee>();
	List<Employee> emp1 = Employee.getEmployees();
	
	System.out.println(emp.iterator());
	emp1.forEach(a->System.out.println(a));
	System.out.println(emp);
	System.out.println("Hellp");
	
	 //Sort all employees by first name
	System.out.println("Sort all employees by first name");
    emp1.sort(Comparator.comparing(e->e.getClass().getName()));
    System.out.println(emp1);
}
}
