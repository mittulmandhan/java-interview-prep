package list.arraylist.example2;

import java.util.ArrayList;

public class A {
	public static void main(String[] args) {
		ArrayList<Object> l = new ArrayList<>();

		// add() method is overloaded

		// this only takes an object to be inserted
		l.add(10);

		// this takes the index of insertion and object to be inserted
		l.add(1, "Java");

		System.out.println(l);
	}
}
