package example21;

public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.setLength(40);
		System.out.println(sb.length());
	}
}