package example3;

// Here, when class B runs
// JVM occupies memory spaces
// JVM loads class B in method area
// JVM identifies B IS-A A
// JVM loads class A in method area
// JVM identifies A IS-A Object
// JVM loads Object class in method area
// method table created and Object's methods added
// Object's static variables' memory allocation and initialization
// A's methods loaded in method table
// A's static variables' memory allocation and initialization
// B's methods added
// B's static variables' memory allocation and initialization
// JVM searches for main method in method table
// JVM access uses the bytecode reference of main method and execute its code
public class B extends A {
	
	public static void main(String[] args) {
		// object creation at this line 
		// when B's object created method table reference is stored in object
		// and instance variables get loaded in object
		B b=new B();
		// JVM identifies method calling is done using b i.e. a reference variable of an object of type B
		// B's method table is accessed using method table reference stored in current object(b)
		// JVM searches ab() in B's method method
		// ab() method executed using the bytecode reference in method table
		b.ab();
	}
	
}
