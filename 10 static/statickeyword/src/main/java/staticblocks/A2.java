package staticblocks;

//Here, when class A2 runs
//JVM occupies memory spaces
//JVM loads class A2's bytecode in method area
//JVM identifies A2 IS-A Object
//JVM loads Object class' bytecode in method area
//method table created and Object's methods added
//Object's static variables' memory allocation and initialization
//Object's static block executes
//A2's methods loaded in method table
//A2's static variable x & y allocated memory and initialized
//A2's static block executes and it calls my() static method to initialize y
//JVM searches for main method in method table
//JVM uses the bytecode reference of main method and execute its code
public class A2 {
	static int x=8;
	static int y;
	
	static {
		System.out.println("In static block");
		y = my();
	}
	
	static int my() {
		return x*x;
	}
	
	public static void main(String[] args) {
		System.out.println("In main()");
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
}
