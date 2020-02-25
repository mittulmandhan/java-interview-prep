package constructorcallingconstructor;

// here ab() method is static so we will not face
// such problem we were facing in the previous program
public class D {
	int x=10;
	
	D() {
		this(ab());// this(D.ab())
	}
	
	D(int x) {
		System.out.println("B");
	}
	static int ab() {
		return 10;
	}
	
	public static void main(String[] args) {
		new D();
	}
}
