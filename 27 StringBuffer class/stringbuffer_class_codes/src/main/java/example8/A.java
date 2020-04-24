package example8;

public class A {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mittul");
		System.out.println(sb);
		System.out.println(sb.replace(0, 5, "Kewa"));
	}
}