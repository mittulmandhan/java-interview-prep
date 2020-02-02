package staticnestedclass;

//Here, when class Outer runs
//JVM occupies memory spaces
//JVM loads class Outer's and Inner's bytecode in method area
//JVM identifies Outer IS-A Object
//JVM loads Object class' bytecode in method area
//method table created and Object's methods added
//Object's static variables' memory allocation and initialization
//Object's static block executes
//Outer's and Inner's methods loaded in method table
//Outer's and Inner's static variable x allocated memory and initialized
//Outer's and Inner's static block executes
//JVM searches for main method in method table
//JVM uses the bytecode reference of main method and execute its code
public class Outer {
	static int x=10;
	
	// Inner class can only access static members of Outer class
	static class Inner {
		void my() {
			System.out.println("In my()");
			System.out.println(x);// Outer.x
		}
		public static void main(String[] args) {
			System.out.println("In main()");
			Inner obj=new Inner();
			obj.my();
		}
	}
}
