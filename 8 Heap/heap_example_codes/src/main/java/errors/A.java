package errors;

//Run time exception example
public class A {
	int x=10;
	
	public static void main(String[] args) {
		A obj=null;// obj=null
		// this line will show a run time error at line:11 since obj is storing null as an object
		// error message: NullPoiterException
		System.out.println(obj.x);// null
		System.out.println("Java");
	}
}
