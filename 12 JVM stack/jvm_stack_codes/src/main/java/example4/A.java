package example4;

public class A {
	void ab() {
		System.out.println("In ab()");// In ab()
		
		// here compiler will see that a non-static member ab() is calling another non-static member my() by name
		// so compiler will replace my with this.my i.e. 101.my()
		my();// 101.my() pushed on stack with hidden this=101
	}// 101.ab() popped from stack
	
	void my() {
		System.out.println("In my()");
	}// 101.my() popped from stack
	
	// main pushed on stack
	public static void main(String[] args) {
		new A().ab();// 101.ab() pushed on stack with hidden this=101
	}// main popped from stack
}
