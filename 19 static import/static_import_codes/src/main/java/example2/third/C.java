package example2.third;
import static example2.first.A.x;
// static variable with name x is imported already
// importing the variable having name x again will cause ambiguity
import static example2.second.B.x;
class C {
	public static void main(String args[]) {
		// here compiler will be confused where to search x
		System.out.println(x);
	}
}
