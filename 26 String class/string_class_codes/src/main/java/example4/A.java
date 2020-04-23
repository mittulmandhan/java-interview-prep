package example4;

public class A {
	public static void main(String[] args) {
		byte[] byte_arr = { 72, 101, 108, 108, 111 };
		String s = new String(byte_arr, 1, 3);
		System.out.println(s);
	}
}