package example11;

//Here, interface A's ab() method will be loaded in the method table 
//then B's ab() method table will override it
//and atlast class C's ab() method override class B's ab() method
class C implements A, B {
	public void ab() {
		System.out.println("in ab()");
	}

	public static void main(String[] args) {
		C c = new C();
		c.ab();
	}
}