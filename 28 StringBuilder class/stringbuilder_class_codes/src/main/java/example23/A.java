package example23;

public class A {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Mittul");
		System.out.println(sb);
		System.out.println(sb.subSequence(1, 5));
		System.out.println(sb.subSequence(3, 6));
	}
}