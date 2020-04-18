package example7;

class B {
	public static void main(String[] args) {
		// All of this statements are valid
		// as x & y are static member of interface A
		// as B implements A
		// and x & y are inherited in B
		System.out.println(x);
		System.out.println(B.x);
		System.out.println(A.x);
	}
}