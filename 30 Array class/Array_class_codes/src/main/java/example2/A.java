package example2;

import java.lang.reflect.Array;

public class A {
	public static void main(String[] args) {
		// creating an boolean array using Array class
		boolean[] arr = (boolean[]) Array.newInstance(boolean.class, 4);
		
		// adding values to boolean elements using Array class
		Array.setBoolean(arr, 0, true);
		Array.setBoolean(arr, 1, false);
		Array.setBoolean(arr, 2, true);
		Array.setBoolean(arr, 3, true);
		
		// getting the values of boolean elements using Array class
		System.out.println(Array.getBoolean(arr, 0));
		System.out.println(Array.getBoolean(arr, 1));
		System.out.println(Array.getBoolean(arr, 2));
		System.out.println(Array.getBoolean(arr, 3));
	}
}