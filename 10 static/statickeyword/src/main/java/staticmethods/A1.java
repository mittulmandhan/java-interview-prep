package staticmethods;

//Here, when class A1 runs
//JVM occupies memory spaces
//JVM loads class A1's bytecode in method area
//JVM identifies A1 IS-A Object
//JVM loads Object class' bytecode in method area
//method table created and Object's methods added
//Object's static variables' memory allocation and initialization
//Object's static block executes
//A1's methods loaded in method table
//A1's static variables allocated memory and initialized
//A1's static block executes
//JVM searches for main method in method table
//JVM uses the bytecode reference of main method and execute its code
//then ab() method is called(even before creating any object)
public class A1 {
	static void ab() {
	    System.out.println("In ab()");
	}
	  
	public static void main(String[] args) {
		System.out.println("In main()");
		ab();// A1.ab()
	}
};