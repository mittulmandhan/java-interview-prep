// only the reference for ab() method in the method table will be overwritten at the run-time
// that means the no additonal row will be added for the ab() method in class B only the reference will be updated from class A's ab() method to class B's ab() method

package example7;

class B extends A {
	void ab() {
		System.out.println("B");
	}

	public static void main(String args[]) {
		new B().ab();
	}
}
