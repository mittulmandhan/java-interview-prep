package example3;

public class GenericMethodDemo {

	private <T> void show(T value) {
		System.out.println(value);
	}

	public static void main(String[] args) {
		GenericMethodDemo gm = new GenericMethodDemo();

		gm.show("Mittul");

		gm.show(new Student(5));
	}

}

class Student {
	private int id;

	public Student(Integer id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}

}
