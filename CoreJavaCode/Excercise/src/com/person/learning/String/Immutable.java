package com.person.learning.String;

public final class Immutable {
	final String a;
public static void main(String[] args) {

Immutable a = new Immutable("String");

}

public Immutable(String s) {
	this.a =s;
}

public String getA() {
	return a;
}
}

