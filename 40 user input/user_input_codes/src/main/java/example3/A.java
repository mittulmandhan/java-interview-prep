package example3;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(s);
		int a = scan.nextInt();
		System.out.println(a);
		float b = scan.nextFloat();
		System.out.println(b);

		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = scan.nextInt();
		}

		for (int i : arr) {
			System.out.println(i);
		}
	}
}
