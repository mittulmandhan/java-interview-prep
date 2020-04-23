package example8;

public class A {
	public static void main(String[] args) {
		char[] char_arr = { 'H', 'e', 'l', 'l', 'o' };
		String s = new String(char_arr, 1, 3);
		System.out.println(s);
	}
}