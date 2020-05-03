package example16;

import java.util.Arrays;

public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		Arrays.parallelSort(arr);

		for (int i : arr) {
			System.out.println(i);
		}
	}
}