package immutalConcept1;

import java.util.Map;

public final class  ImmutalClassCreation {
private static final String String = null;
private final String name;
private final String surname;
private final Map<String,String> map;

public String getName() {
	return name;
}
public String getSurname() {
	return surname;
}
public Map<String, String> getMap() {
	return map;
}
public ImmutalClassCreation(java.lang.String name, java.lang.String surname,
		Map<java.lang.String, java.lang.String> map) {
	super();
	this.name = name;
	this.surname = surname;
	this.map = map;
}
 
 
}
