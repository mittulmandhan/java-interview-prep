package example16;

public class A {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mittul");
		System.out.println(sb);
		char[] dst= {'a','b','c','d','e','f'};
		sb.getChars(0, 4, dst, 0);
		System.out.println(dst);
	}
}