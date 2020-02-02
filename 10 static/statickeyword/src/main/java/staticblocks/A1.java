package staticblocks;

//Here, when class A1 runs
//JVM occupies memory spaces
//JVM loads class A1's bytecode in method area
//JVM identifies A1 IS-A Object
//JVM loads Object class' bytecode in method area
//method table created and Object's methods added
//Object's static variables' memory allocation and initialization
//Object's static block executes
//A1's methods loaded in method table
//A1's static variable x & y allocated memory and initialized
//A1's static block executes and y gets a value i.e. x*x
//JVM searches for main method in method table
//JVM uses the bytecode reference of main method and execute its code
public class A1 {
	static int x=10;
	static int y;
	
	// static block is executed just after the initialization of the static variables
	static {
		System.out.println("In static block");
		y = x*x;
	}
	
	public static void main(String[] args) {
		System.out.println("In main()");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
}
