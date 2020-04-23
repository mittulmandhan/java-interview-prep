package example3;

import java.io.UnsupportedEncodingException;

public class A {
	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] byte_arr = { 72, 101, 108, 108, 111 };
		String s = new String(byte_arr, "US-ASCII");
		System.out.println(s);

		s = new String(byte_arr, "UTF-8");
		System.out.println(s);
	}
}