package staticerrors;

public class A {
	void ab() {
		// here we are trying to declare a static variable at local scope
		// Compiler will show an error 'x cannot be resolved to a variable'
		static int x=20;
	}
	
	public static void main(String[] args) {
		System.out.println(x);
	}
}
