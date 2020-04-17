// now that B is inheriting A
// so child B has to override all the abstract methods of abstract super class A
// here B will give body or implementation of ab() method

package example10;

public class B extends A {
	void ab() {
		System.out.println("ab()");
	}

	public static void main(String[] args) {
		// there is a parent to child relationship between A & B
		// we cant create object of abstract class A
		// but we can make a reference variable of abstract class A
		// and store a reference of its child class B's object in it
		A a = new B();

		// At compile time, compiler have set calling of ab() method of class A
		// because compiler works on reference variables & here ab() is called
		// using reference variable of type A
		// But at runtime ab() method of class B will be called
		// because object is of class B & jvm will search ab() in method method
		// table of class B
		// where ab() method's bytecode reference, which is pointing to ab()
		// method in class A, is overwritten by class B's bytecode reference for
		// ab() method
		// so ultimately ab() method of class B will be called
		a.ab();
	}
}
