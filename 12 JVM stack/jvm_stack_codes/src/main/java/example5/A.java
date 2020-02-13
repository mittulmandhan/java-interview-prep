package example5;

// here
public class A {
	int x=10;
	
	void ab(A a/* a=101 */) {
		// 101.my() pushed on stack with this=101
		my();// this.my() i.e. 101.my()
		
		// 102.my() pushed on stack with this=102
		a.my();// 102.my()
	}// 101.ab() popped from stack
	
	void my() {
		//In first call, 101.x i.e. 60
		//In second call, 102.x i.e. 10
		System.out.println(x);
	}//In first call, 101.my()/In second call, 102.my() popped from stack
	
	//main pushed on stack
	public static void main(String[] args) {
		//A's constructor for this=101 pushed and popped from stack
		A a=new A();// a=101
		a.x=60;// 101.x=60
		//101.ab() pushed on stack with this=101
		a.ab(new A());// 101.ab(102)
	}// main popped from stack
}
