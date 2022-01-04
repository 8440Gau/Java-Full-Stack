package mapvsflatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapvsFlatMap {
public static void main(String[] args) {
	List<Customer> cus = EkartDataBase.getAll();
	//List<Customer> convert List<String> --> Data transformation
	  //its called one to one mapping(email--> email.getEmail())
       List<String> email=cus.stream().map(m->m.getEmail()).collect(Collectors.toList());
	 
       email.forEach(a->System.out.println(a));
	
       
       //customers one to many 
       
       List<List<String>> ph = cus.stream().map(m->m.getPhoneNumbers()).collect(Collectors.toList());
       
       System.out.println(ph);
       
       //one to many using flatmap
       List<String> s= cus.stream().flatMap(m->m.getPhoneNumbers().stream()).collect(Collectors.toList());
       System.out.println(s);
       
}
}
