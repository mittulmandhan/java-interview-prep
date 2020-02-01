package example1;

// When we run this class
// JVM occupies memory spaces
// JVM loads bytecode of A in method area
// A's method table created and all method in A loaded in that method table
// JVM will search and find main method in method table 
// JVM executes the main method using the bytecode reference stored in method table
// Note: we will go deeper in further codes but for now that's all
public class A {
	void ab() {
		System.out.println("in ab()");
	}
	
	public static void main(String[] args) {
		A a=new A();
		a.ab();
	}
}
