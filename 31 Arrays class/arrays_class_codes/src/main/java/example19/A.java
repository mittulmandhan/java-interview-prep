package example19;

import java.util.Arrays;

public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		Arrays.sort(arr, 2, 6);

		for (int i : arr) {
			System.out.println(i);
		}
	}
}