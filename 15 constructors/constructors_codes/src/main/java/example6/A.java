package example6;

// We can overcome forward reference using a simple trick
// but since the referenced variable still not assigned its actual initial value
// so no matter what you will receive only default value of that variable
public class A {
	// here x is initialized using ab() method
	// and ab() is returning y
	// but y is not given its actual initial value at this point
	// so ab() will return y's default value i.e. 0
	int x=ab();
	int y=10;// at this line y is assigned its actual initial value i.e. 10
	
	int ab() {
		return y;// return 0;
	}
	
	public static void main(String[] args) {
		A a=new A();
		System.out.println(a.x);
		System.out.println(a.y);
	}
}
