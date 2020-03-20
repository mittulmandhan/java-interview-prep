package example3;

public class A {
	public static void main(String[] args) {
		for(int x=1;x<5;x++) {
			System.out.println(x);
		}
		// x cannot be accessed outside local block
		// so this code will not compile and 
		// compiler will show error message
		// "x i not defined" or "x cannot be resolved to a variable"
		System.out.println(++x);
	}
}
