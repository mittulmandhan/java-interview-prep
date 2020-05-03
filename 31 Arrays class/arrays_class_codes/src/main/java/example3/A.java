package example3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		int[] arr2 = { 15, 23, 9, 16 };
		System.out.println(Arrays.compare(arr, arr2));
	}
}
