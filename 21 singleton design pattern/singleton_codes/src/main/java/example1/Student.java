package example1;

public class Student {
	// step 2
	private static Student instance;

	// step 3
	static {
		instance = new Student();
	}

	// step 1
	private Student() {
	}

	// step 4
	public static Student getStudent() {
		return instance;
	}
}