package example8;

// forward referencing rule
public class A {
	// forward referencing rule restricts you to use 
	// the variable in initializer which is textually
	// declared after the variable being initialized
	// so this line will show compilation error
	int x=y;
	int y=10;
	
	public static void main(String[] args) {
		new A();
	}
}
