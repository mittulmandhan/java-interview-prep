package example2;

public final class Student {
	private final String name;
	private final int roll;

	Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}

	public String getStudentName() {
		return this.name;
	}

	public int getStudentRoll() {
		return this.roll;
	}
}
