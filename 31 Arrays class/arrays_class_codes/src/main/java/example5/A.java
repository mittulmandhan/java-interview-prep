package example5;

import java.util.Arrays;

public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		int[] copyArr = Arrays.copyOf(arr, 7);
		for (int i : copyArr) {
			System.out.println(i);
		}
	}
}
