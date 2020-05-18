package example4;

// when a compile time error occurs
// try catch is neccessary to run the program
// otherwise program will not compile
// If an unchecked error occurs then it is handled by JVM(default)
// It is not necessary for us to handle it
public class A1 {
	public static void main(String[] args) {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("catch block");
		}

		System.out.println("end of main");
	}
}
