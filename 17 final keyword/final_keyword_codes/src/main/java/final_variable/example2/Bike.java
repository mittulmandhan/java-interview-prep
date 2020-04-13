package final_variable.example2;

public class Bike {
	int cube(final int n) {
		// compile time error
		// finak variable n is being assigned values more than once
		n = n + 2;// can't execute this line of code as n is final
		return n * n * n;
	}

	public static void main(String args[]) {
		Bike b = new Bike();
		System.out.println(b.cube(5));
	}
}
