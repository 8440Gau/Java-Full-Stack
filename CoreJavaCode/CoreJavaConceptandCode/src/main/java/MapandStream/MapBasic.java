package MapandStream;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapBasic {
public static void main(String[] args) {

	Map<String,String> mp = new HashMap<String,String>();
	
	mp.put("978-0201633610", "Design patterns : elements of reusable object-oriented software");
	mp.put("978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
	mp.put("978-0134685991", "Effective Java");
	
	
	//Searching the element using stream
	
    Optional<String> otp = mp.entrySet().stream().filter(p->"Effective Java".equals(p.getValue())).map(Map.Entry::getKey).findFirst();
     
}
}
