package example24;

import java.util.Arrays;
import java.util.stream.IntStream;

public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		IntStream i = Arrays.stream(arr);
		i.forEach((x) -> System.out.println(x));
	}
}