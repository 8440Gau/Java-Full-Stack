package comparaabl3evscomparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class NetacomaprevoteusingComparator {
public static void main(String[] args) {
	
	List<NetacomaprevoteusingComparator> getall = getNeta();
	System.out.println(getall);
	System.out.println("=======");
	Comparator<NetacomaprevoteusingComparator> group = Comparator.comparing(NetacomaprevoteusingComparator::getVotes).thenComparing(NetacomaprevoteusingComparator::getAge).thenComparing(NetacomaprevoteusingComparator::getName);
	getall.sort(group.reversed());
	System.out.println(getall);
	System.out.println("java 8");
      getall.stream().sorted(Comparator.comparing(NetacomaprevoteusingComparator::getVotes).thenComparing(NetacomaprevoteusingComparator::getAge)).forEach(a->System.out.println(a));;
	
	
}
String name;
String age;
String votes;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getVotes() {
	return votes;
}
public void setVotes(String votes) {
	this.votes = votes;
}
@Override
public String toString() {
	return "NetacomaprevoteusingComparator [name=" + name + ", age=" + age + ", votes=" + votes + "]";
}
public NetacomaprevoteusingComparator(String name, String age, String votes) {
	super();
	this.name = name;
	this.age = age;
	this.votes = votes;
}

public static List<NetacomaprevoteusingComparator> getNeta(){
	 List<NetacomaprevoteusingComparator> net  = new ArrayList<>();
	 
	 net.add(new NetacomaprevoteusingComparator("bhsokdk","74","10342"));
	 net.add(new NetacomaprevoteusingComparator("congrees","52","13342"));
	 net.add(new NetacomaprevoteusingComparator("sp","34","90342"));
	 net.add(new NetacomaprevoteusingComparator("bsp","63","5012"));

	return net;
	 
	 
}

}
