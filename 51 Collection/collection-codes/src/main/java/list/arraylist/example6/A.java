package list.arraylist.example6;

import java.util.ArrayList;

public class A {
	public static void main(String[] args) {
		ArrayList<Object> l = new ArrayList<>();

		l.add(10);
		l.add("Java");
		l.add(1, 20);

		// get() takes an integer as argumant
		// which represents an index
		// and it returns the value at present at given index
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
	}
}