package example4;

public class A {
	void canIVote(int age) {
		if (age < 18) {
			throw new ArithmeticException("No, your age is less than 18");
		} else {
			System.out.println("Yes, you can vote!");
		}
	}

	public static void main(String[] args) {
		new A().canIVote(20);
		new A().canIVote(15);
	}
}
