package constructorcallingconstructor;

// here initializer still has not done its job
// No doubt method is created but its address is not loaded in object
// so, object is not completely created
// thus, this.ab() will not find any method table reference(vtable reference) in object
public class C {
	int x=10;
	
	C() {
		this(ab());// this(this.ab()) i.e. this(101.ab())
	}
	
	C(int x) {
		System.out.println("B");
	}
	int ab() {
		return 10;
	}
	
	public static void main(String[] args) {
		new C();
	}
}
