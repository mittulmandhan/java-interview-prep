package example1;

import java.util.ArrayList;

public class Unboxing {
	public static void main(String args[]) {
		Character ch = 'a';

		// unboxing: Character object to premitive char type conversion
		char a = ch;

		// printing unboxed char
		System.out.println(a);

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(24);

		// unboxing because get method returns an Integer object
		int num = arr.get(0);

		// printing the value of primitive int type
		System.out.println(num);
	}
}