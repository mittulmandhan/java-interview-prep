package example20;

public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		sb.setCharAt(3, 'h');
		System.out.println(sb);
	}
}