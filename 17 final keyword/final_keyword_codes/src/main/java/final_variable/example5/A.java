// when we are using both const & init block
// the value initialization must be done in init block
// because init block is executed before constructor
// so if interchange the codes inside the given constructor and init block
// it will not compile but for now it is good to go

package final_variable.example5;

public class A {
	final int x,y;
	{
		x=10;
		y=20;
	}
	A() {
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		new A();
	}
}
