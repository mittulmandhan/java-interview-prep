package example1;

public class Student {
	// step 2
	private static Student s;

	// step 3
	static {
		s = new Student();
	}

	// step 1
	private Student() {
	}

	// step 4
	static Student getStudent() {
		return s;
	}
}