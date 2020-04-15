package example1;

import java.util.ArrayList;

public class Autoboxing {
	public static void main(String args[]) {
		char ch = 'a';

		// Autoboxing: primitive char to Character object conversion
		Character a = ch;

		// printing autoboxed Character object
		System.out.println(a);

		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		// Autoboxing because ArrayList stores only objects
		arrayList.add(25);

		// printing the value from Integer object
		System.out.println(arrayList.get(0));
	}
}
