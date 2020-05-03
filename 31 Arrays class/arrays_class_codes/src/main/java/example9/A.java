package example9;

import java.util.Arrays;

import example9.B;

public class A {
	public static void main(String[] args) {
		B[] arr = { new B(),new B(7), new B(17) };
		B[] arr2 = { new B(),new B(7), new B(17) };

		System.out.println(Arrays.equals(arr, arr2));
	}
}
