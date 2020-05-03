package example20;

import java.util.Arrays;
import java.util.Comparator;

import example20.B;

public class A {
	public static void main(String[] args) {
		B[] arr = { new B(34), new B(28), new B(6), new B(11), new B(35), new B(16) };
		Arrays.sort(arr, 3, 6, new Sorter());

		for (B i : arr) {
			System.out.println(i.x);
		}
	}
}

class Sorter implements Comparator<B> {

	@Override
	public int compare(B o1, B o2) {
		return o2.x - o1.x;
	}

}