package example1;

public class A {
	void ab() {
		System.out.println("in ab()");
	}
	// first frame pushed on stack for main method
	public static void main(String[] args) {
		A a = new A();// 2nd frame for A's constructor pushed on stack and then popped
		a.ab();// 2nd frame for ab() method pushed on stack and then popped
	}// main() method popped from stack
}
