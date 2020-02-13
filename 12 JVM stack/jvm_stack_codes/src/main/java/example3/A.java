package example3;

public class A {
	int x=10;
	
	void ab() {
		System.out.println(x);
	}
	
	// main() method loaded on stack
	public static void main(String[] args) {
		//A's constructor for 101(a) loaded and popped from stack
		A a=new A();// a=101
		//A's constructor for 102(b) loaded and popped from stack
		A b=new A();// b=102
		a.x=60;// 101.x=60
		
		// 101.ab() loaded and popped from stack
		a.ab();// 101.ab() hence this=101
		// 102.ab() loaded and popped from stack
		b.ab();// 102.ab() hence this=102
	}// main() popped from stack
}
