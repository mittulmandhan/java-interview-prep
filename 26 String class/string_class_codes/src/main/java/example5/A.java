package example5;

import java.nio.charset.Charset;

public class A {
	public static void main(String[] args) {
		byte[] byte_arr = { 72, 101, 108, 108, 111 };
		Charset charset = Charset.defaultCharset();
		String s = new String(byte_arr, 1, 3, charset);
		System.out.println(s);
	}
}