package example4;

public class A {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mittul");
		System.out.println(sb);
		System.out.println(sb.insert(6, " Mandhan"));
		System.out.println(sb.insert(14, 22));
	}
}