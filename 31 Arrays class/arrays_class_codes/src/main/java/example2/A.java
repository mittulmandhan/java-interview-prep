package example2;

import java.util.Arrays;

public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 34));
	}
}
