package example12;

import java.util.Arrays;

public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		int[] arr2 = { 15, 23, 9, 16 };
		System.out.println(Arrays.mismatch(arr, arr2));
	}
}
