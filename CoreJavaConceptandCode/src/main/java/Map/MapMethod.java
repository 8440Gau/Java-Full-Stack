package Map;

import java.util.HashMap;
import java.util.Map;



public class MapMethod {
public static void main(String[] args) {
	
	Map<String,String> map = new HashMap<String,String>();
	map.put("1", "a");
	map.put("2", "B");
	
	boolean t=map.containsKey("2");
	System.out.println(t);
	System.out.println(map.keySet());
	System.out.println("entrySet "+ map.entrySet());
}
}
