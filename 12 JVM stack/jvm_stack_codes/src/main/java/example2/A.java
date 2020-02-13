package example2;

// Compiler uses this keyword when a non-static member calls another non-static member of the same class
// then compiler replaces the code i.e. x becomes this.x @line: 10
public class A {
	int x=10;
	
	// ab() will receive this reference as it is an instance method
	void ab() {
		System.out.println(x);// this.x i.e. 10
	}
	// 1st frame pushed for main() method
	// main() method will have no 'this' reference variable since it is a static method
	public static void main(String[] args) {
		A a=new A();// A's constructor pushed and popped from stack
		a.ab();// ab() method pushed and popped from stack
	}
}
