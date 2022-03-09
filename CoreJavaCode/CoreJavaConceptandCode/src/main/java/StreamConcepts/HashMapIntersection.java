package StreamConcepts;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Map;

public class HashMapIntersection {
public static void main(String[] args) {
	HashMap<String,String> hs1 = new HashMap<String,String>();
	
	hs1.put("1", "dfd");
	hs1.put("2", "dad");
	hs1.put("3", "qwe");
	hs1.put("4", "ewq");
	hs1.put("5", "tew");
	
	HashMap<String,String> hs2 = new HashMap<String,String>();
	hs2.put("4", "zxc");
	hs2.put("5", "zzsc");
	hs2.put("10", "aqs");
	hs2.put("11", "saq");
	hs2.put("12", "aaa");
	
	Set result = new HashSet(hs1.keySet());
	System.out.println(result.retainAll(hs2.keySet()));
  //  System.out.println("Commons Objects of List 1 and List 2: " + CollectionUtils.intersection(hs1, hs2));
	HashMap<String,String> hs3 = new HashMap<String,String>();
	//hs2.putAll(hs1);
	
	System.out.println(hs2);
	hs1.keySet().retainAll(hs2.keySet());
	System.out.println("=====");
     System.out.println(hs1);	
	//Set<String> s = newHashSet<String>(hs)
     
     Set<String> s = new HashSet<String>();
     s.add("1");
     s.add("2");
     s.add("3");
     s.add("4");
     Set<String> s1 = new HashSet<String>();
     s1.add("4");
     s1.add("3");
     s1.add("1");
     s1.add("9");
     Set<String> s3 = new HashSet<String>();
     System.out.println("***");
    System.out.println(s1.retainAll(s));
    // s.retainAll(s1);
     //System.out.println(s);
     //Set<String> s4 = new HashSet<String>(0, 0, Collections.);
     System.out.println("============");
    // s.stream().filter(s0-> s.contains(s1)).collect(Collectors.toSet()).forEach(a->System.out.println(a));
    s.removeAll(s1);
    System.out.println(s);
}
}