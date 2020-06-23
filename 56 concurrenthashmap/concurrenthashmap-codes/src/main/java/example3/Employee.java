package example3;

public class Employee {
	static int idCount;
	final Integer id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int hashCode() {
		return id;
	};

	public boolean equals(Employee obj) {
		if (obj.id == this.id) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return id + " " + name;
	}
}
