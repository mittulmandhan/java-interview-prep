package example9;

// This code shows the correct child first archtecture
public class A {
	public static void main(String[] args) {
		try {
			System.out.println(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("A");
		} catch (Exception e) {
			System.out.println("B");
		}
	}
}
