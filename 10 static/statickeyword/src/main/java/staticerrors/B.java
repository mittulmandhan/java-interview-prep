package staticerrors;


//In this example, static variable by name accessing tried outside class
// class B is trying to access static variable x of class B1
public class B {
	public static void main(String[] args) {
		System.out.println(x);
	}
}

class B1 {
	static int x=10;
}
