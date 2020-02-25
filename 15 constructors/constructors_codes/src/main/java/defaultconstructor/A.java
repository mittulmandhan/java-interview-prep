package defaultconstructor;

//this class does not have any explicit constructor
//so compiler will make a default constructor 
//default constructor takes no argument and invokes super class' constructor in its body
public class A {
	
	 // this piece of code will be added
	 // by the compiler in the absence of
	 // a user defined constructor
	 /* Default Constructor
	 *A() {
	 *	super();
	 *} 
	 */
	
	public static void main(String[] args) {
		A obj=new A();
	}
}
