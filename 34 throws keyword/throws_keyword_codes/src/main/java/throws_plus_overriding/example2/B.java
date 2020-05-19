package throws_plus_overriding.example2;

// here ab() in class A does not throws any exception
// but ab() in class B throws Exception
// So this code will show error @line:10
// since we are declaring a checked exception
// in ab() method's signature 
public class B extends A {
	@Override
	void ab() throws Exception {
		System.out.println("B");
	}

	public static void main(String[] args) throws Exception {
		new B().ab();
	}
}
