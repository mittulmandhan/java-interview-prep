package example3;

import java.lang.reflect.Array;

public class A {
	public static void main(String[] args) {
		// creating an char array using Array class
		char[] arr = (char[]) Array.newInstance(char.class, 4);
		
		// adding values to char elements using Array class
		Array.setChar(arr, 0, 'z');
		Array.setChar(arr, 1, 'a');
		Array.setChar(arr, 2, 'r');
		Array.setChar(arr, 3, 'a');
		
		// getting the values of char elements using Array class
		System.out.println(Array.getChar(arr, 0));
		System.out.println(Array.getChar(arr, 1));
		System.out.println(Array.getChar(arr, 2));
		System.out.println(Array.getChar(arr, 3));
	}
}