package example1;

import java.util.Arrays;
import java.util.List;

public class A {
	public static void main(String[] args) {
		int[][] arr = { { 34, 23, 28, 6, 11, 35, 16 }, { 7, 34, 8, 10 } };
		List<int[]> ll = Arrays.asList(arr);

		for (int[] is : ll) {
			for (int i : is) {
				System.out.println(i);
			}
		}
	}
}
