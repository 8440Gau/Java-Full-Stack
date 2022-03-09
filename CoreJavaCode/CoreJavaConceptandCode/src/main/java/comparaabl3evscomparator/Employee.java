package comparaabl3evscomparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {
	public static void main(String[] args) {
		 List<Employee> employees  = getEmployees();
		 //Sort all employees by first name
		 System.out.println("Sort all employees by first name");
		  employees.sort(Comparator.comparing(e -> e.getFirstName()));
		//Let's print the sorted list
		  System.out.println(employees);
		  System.out.println("Sort all employees by first name reverse order");
		  Comparator<Employee> comparator = Comparator.comparing(e -> e.getFirstName());
		  employees.sort(comparator.reversed());
		   
		  //Let's print the sorted list
		  System.out.println(employees);
		  
		  List<Employee> employee1  = getEmployees();
		  
		//Sorting on multiple fields; Group by.
		Comparator<Employee> groupByComparator = Comparator.comparing(Employee::getFirstName)
		                          .thenComparing(Employee::getLastName);
		employee1.sort(groupByComparator);
		 System.out.println("List<Employee> employees  = getEmployees();\r\n");
		System.out.println(employee1);
	}
	
	private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
     
    public Employee(Integer id, String firstName, String lastName, Integer age){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
	

	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}



	public static List<Employee> getEmployees(){
		  List<Employee> employees  = new ArrayList<>();
		  employees.add(new Employee(6,"Yash", "Chopra", 25));
		  employees.add(new Employee(2,"Aman", "Sharma", 28));
		  employees.add(new Employee(3,"Aakash", "Yaadav", 52));
		  employees.add(new Employee(5,"David", "Kameron", 19));
		  employees.add(new Employee(4,"James", "Hedge", 72));
		  employees.add(new Employee(8,"Balaji", "Subbu", 88));
		  employees.add(new Employee(7,"Karan", "Johar", 59));
		  employees.add(new Employee(1,"Lokesh", "Gupta", 32));
		  employees.add(new Employee(9,"Vishu", "Bissi", 33));
		  employees.add(new Employee(10,"Lokesh", "Ramachandran", 60));
		  return employees;
		}
   
}