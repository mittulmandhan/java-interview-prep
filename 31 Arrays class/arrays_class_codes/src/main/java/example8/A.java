package example8;

import java.util.Arrays;

import example8.B;

public class A {
	public static void main(String[] args) {
		B[] arr = { new B(), new B(7), new B(17) };

		System.out.println(Arrays.deepToString(arr));
	}
}
