package example25;

public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.trimToSize();
		System.out.println(sb.capacity());
	}
}