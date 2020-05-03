package example23;

import java.util.Arrays;
import java.util.Spliterator;

public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		Spliterator<?> s = Arrays.spliterator(arr,2,6);
		s.forEachRemaining((x) -> System.out.println(x));
	}
}