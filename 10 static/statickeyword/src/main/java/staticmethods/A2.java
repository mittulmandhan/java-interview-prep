package staticmethods;

//Here, when class A2 runs
//JVM occupies memory spaces
//JVM loads class A2's bytecode in method area
//JVM identifies A2 IS-A Object
//JVM loads Object class' bytecode in method area
//method table created and Object's methods added
//Object's static variables' memory allocation and initialization
//Object's static block executes
//A2's methods loaded in method table i.e. my()
//A1's static variable x allocated memory and initialized using my()
//A1's static block executes
//JVM searches for main method in method table
//JVM uses the bytecode reference of main method and execute its code
public class A2 {
	static int x=my();
	
	static int my() {
		System.out.println("In my()");
		return 20;
	}
	
	public static void main(String[] args) {
		System.out.println("In main()");
		System.out.println(A2.x);
	}
}
