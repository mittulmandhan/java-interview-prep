package list.arraylist.example1;

import java.util.ArrayList;

public class A {
	public static void main(String[] args) {
		ArrayList<Object> l = new ArrayList<>();

		// 10 added @ index 0
		// Java added @ index 1
		l.add(10);
		l.add("Java");

		// this statement will automatically call
		// toString() on l then internally it will
		// call toString() for Integer wrapper class
		// then call toString for String class
		System.out.println(l);
	}
}
