package example13;

import java.util.Arrays;

public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		Arrays.parallelPrefix(arr, 2, 5, (x,y) -> x+y);
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
