package errors;

// this is the case of stack overflow
// Because when we will create object of A4
// an instance level variable will be initialized with an object of type A4
// which in turn will create a new object and so on
// which will ultimately overflow the the stack memory
public class A4 {
	int x=10;
	A4 a=new A4();
	
	public static void main(String[] args) {
		A4 obj=new A4();
		System.out.println(obj.x);
	}
}