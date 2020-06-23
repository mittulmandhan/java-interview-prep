package hashmap.example1;

public class Student {
	final Integer id;

	public Student(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	public boolean equals(Student obj) {
		return id.equals(obj.id);
	}
}
