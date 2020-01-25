package errors;

// compile time error
public class B {
	eg obj;
	
	public static void main(String[] args) {
		B b=new B();
		
		// Here, obj is an instance level reference variable
		// So obj will be initialized with default value i.e. null
		// so while using obj we will get a runtimeException
		// error message: NullPointerException
		System.out.println(b.obj.x);
	}
}

class eg {
	int x=10;
}
