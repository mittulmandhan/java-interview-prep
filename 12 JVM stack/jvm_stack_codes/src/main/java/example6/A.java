package example6;

public class A {
	int x=10;
	
	void ab(A a/* a=101 */) {
		
		// 101.my() pushed on stack with this=101
		a.my(this);// 101.my(102)
		
		// 101.my() pushed on stack with this=101
		a.my(a);// 101.my(101)
		
		// 102.my() pushed on stack with this=102
		my(this);// this.my(this) i.e. 102.my(102)
		
		// 102.my() pushed on stack with this=102
		my(a);// this.my(a) i.e. 102.my(101)
		
	}// 102.ab() popped from stack
	
	void my(A a) {
		/* In 1st call, a=102
		 * In 2nd call, a=101
		 * In 3rd call, a=102
		 * In 4th call, a=101*/
		
		System.out.println(x);
		System.out.println(a.x);
		
		/* In 1st call:
		 * print this.x i.e. 101.x i.e. 60
		 * print a.x i.e. 102.x i.e. 10
		 * 
		 * In 2nd call:
		 * print this.x i.e. 101.x i.e. 60
		 * print a.x i.e. 101.x i.e. 60
		 * 
		 * In 3rd call:
		 * print this.x i.e. 102.x i.e. 10
		 * print a.x i.e. 102.x i.e. 10
		 * 
		 * In 4th call:
		 * print this.x i.e. 102.x i.e. 10
		 * print a.x i.e. 101.x i.e. 60
		 * */
		
	}// In 1st call, 101.my()/In 2nd call, 101.my()/In 3rd call, 102.my()/In 4th call, 102.my() popped from stack
	
	// main() pushed on stack
	public static void main(String[] args) {
		// A's constructor for this=101 pushed and popped from stack
		A a=new A();// a=101
		a.x=60;// 101.x=60
		
		// 102.ab() pushed on stack with this=102
		new A().ab(a);// 102.ab(101)
	}// main() popped from stack
	
}
