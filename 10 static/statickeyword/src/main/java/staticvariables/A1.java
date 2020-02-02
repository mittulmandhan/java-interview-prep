package staticvariables;

//Here, when class A1 runs
//JVM occupies memory spaces
//JVM loads class A1's bytecode in method area
//JVM identifies A IS-A Object
//JVM loads Object class in method area
//method table created and Object's methods added
//Object's static variables' memory allocation and initialization
//Object's static block executes
//A1's methods loaded in method table
//A1's static variable x's memory allocation and initialization
//A1's static block executes
//JVM searches for main method in method table
//JVM uses the bytecode reference of main method and execute its code
public class A1 {
	// This static variable is initialized just after the creation of method table
	static int x=10;
	
	public static void main(String[] args) {
		System.out.println(x);// A1.x i.e. 10
	}
}
