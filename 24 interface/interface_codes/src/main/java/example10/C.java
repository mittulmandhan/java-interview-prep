package example10;

//Here, class C is implementing 2 interfaces which is an example multiple inheritance
//And class C is abstract too
//so it can hold abstract methods too
//Now, we have override ab() method but not my() method
//So now child class D is obliged to override my() method unless class D is abstract
abstract class C implements A, B {
	public void ab() {
		System.out.println("in ab()");
	}
}