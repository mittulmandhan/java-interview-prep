package list.arraylist.example4;

import java.util.ArrayList;

// unlike set
// lists can have duplicate values
public class A {
	public static void main(String[] args) {
		ArrayList<Object> l = new ArrayList<>();

		l.add(10);
		l.add("Java");
		l.add(10);

		System.out.println(l);
	}
}
