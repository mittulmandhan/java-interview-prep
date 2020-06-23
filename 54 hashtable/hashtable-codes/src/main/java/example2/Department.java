package example2;

public class Department {
	final String departmentName;

	public Department(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return departmentName;
	}
}
