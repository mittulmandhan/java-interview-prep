package example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] str = reader.readLine().split(" ");

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
