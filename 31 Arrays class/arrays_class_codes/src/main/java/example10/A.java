package example10;

import java.util.Arrays;

public class A {
	public static void main(String[] args) {
		int[] arr = {0, 0, 0, 0, 0, 0};
		Arrays.fill(arr, 10);
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
