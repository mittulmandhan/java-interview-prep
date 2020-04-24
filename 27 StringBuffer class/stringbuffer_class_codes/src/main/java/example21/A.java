package example21;

public class A {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mittul");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.setLength(40);
		System.out.println(sb.length());
	}
}