package list.arraylist.example5;

import java.util.ArrayList;

// unlike set
// lists can have duplicate values
public class A {
	public static void main(String[] args) {
		ArrayList<Object> l = new ArrayList<>();

		l.add(10);// added Integer 10 at index 0
		l.add("Java");// added String "Java" at index 1
		l.add(1, 20);// added Integer 20 at index 1 and "Java" shifted one step rightward i.e. index 2

		System.out.println(l);
		System.out.println(l.size());
	}
}
