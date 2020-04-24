package example9;

public class A {
	public static void main(String[] args) {
		int[] unicodes = { 72, 101, 108, 108, 111 };
		String s = new String(unicodes, 1, 4);
		System.out.println(s);
	}
}
