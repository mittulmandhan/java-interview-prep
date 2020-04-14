package print_statement;
import static java.lang.System.out;
public class A {
	public static void main(String args[]) {
		System.out.println("A");
		// since we have static imported out i.e. a static member of System class
		// we can now skip using System to call out
		out.println("Hello");
	}
}