package example10;

public class A {
	public static void main(String[] args) {
		StringBuffer s_buffer = new StringBuffer("Hello");
		String s = new String(s_buffer);
		System.out.println(s);
	}
}
