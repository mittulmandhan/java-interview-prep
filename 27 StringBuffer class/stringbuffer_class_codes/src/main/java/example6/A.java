package example6;

public class A {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mittul");
		System.out.println(sb);
		System.out.println(sb.delete(1, 5));
	}
}