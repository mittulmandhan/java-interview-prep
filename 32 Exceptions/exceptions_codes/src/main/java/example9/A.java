package example9;

public class A {
	int x = 10;

	public static void main(String[] args) {
		int[] arr = { 10, 6, 34, 17, 20 };
		try {
			System.out.println(arr[7]);
		} catch (Exception e) {
			System.out.println(e.fillInStackTrace());
		}
	}
}