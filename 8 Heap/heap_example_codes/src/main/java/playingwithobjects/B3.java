package playingwithobjects;

public class B3 {
	void ab() {
		// This variable will not be stored in the object that exist in heap
		// because this is a local variable and this will be stored in the frames of stack or you can say method thread
		int x=10;
		my(x);// 101.my(10)
		System.out.println(x);// 10
	}
	
	void my(int x/*x=10*/) {
		x=x+1;// x=10+1
		System.out.println(x);// 11
	}
	
	public static void main(String[] args) {
		B3 b=new B3();// b=101
		b.ab();// 101.ab()
	}
}
