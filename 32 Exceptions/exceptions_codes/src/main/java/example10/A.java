package example10;

// priority of catch vs finally
// this code will print 20
// because finally block is executed before
// the return stattement of the catch block
public class A {
	int my() {
		try {
			throw new NullPointerException();
		} catch (Exception e) {
			System.out.println("in catch");
			return 10;
		} finally {
			return 20;
		}
	}

	public static void main(String[] args) {
		System.out.println(new A().my());
	}
}
