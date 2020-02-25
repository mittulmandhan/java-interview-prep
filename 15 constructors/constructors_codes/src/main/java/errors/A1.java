package errors;

//forward references are not allowed
//an instance variable cannot be initialized using the 
//another instance variable which textually comes after it
//It is a forced rule
//Error message: Cannot reference a field before it is defined
public class A1 {
	// we are trying to use y to initialize x
	// but y textually comes after x
	// hence compiler will show an error
	int x=y;
	int y=10;
	
	public static void main(String[] args) {
		new A1();
	}
}

