package example13;

//variables are not overriden like methods
class C implements A, B {
	public static void main(String[] args) {
		// for class C, A.x and B.x are different
		// so writting only x will confuse compiler
		// and compiler will give error
		System.out.println(x);
	}
}