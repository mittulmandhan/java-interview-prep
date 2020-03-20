package example5;
// init block in inheritance
// flow of execution of init blocks is top to bottom i.e. parent to child
// class A's init block will be executed first and then B's
public class B extends A{
	{
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		new B();
	}
}
