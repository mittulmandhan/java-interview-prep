package example1;

import java.lang.reflect.Array;

public class A {
	public static void main(String[] args) {
		// creating an int array using Array class
		int[] arr = (int[]) Array.newInstance(int.class, 5);
		
		// adding values to int elements using Array class
		Array.set(arr, 0, 10);
		Array.set(arr, 1, 3);
		Array.set(arr, 2, 9);
		Array.set(arr, 3, 1);
		Array.set(arr, 4, 11);
		
		// getting the values of int elements using Array class
		System.out.println(Array.get(arr, 0));
		System.out.println(Array.get(arr, 1));
		System.out.println(Array.get(arr, 2));
		System.out.println(Array.get(arr, 3));
		System.out.println(Array.get(arr, 4));
	}
}
