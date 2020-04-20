package example3;

public class Student {
	String name;
	static int rollcount = 101;
	int roll;

	Student(String name) {
		this.name = name;
		roll = rollcount;
		rollcount++;
	}

	@Override
	public int hashCode() {
		return roll;
	}

	public static void main(String[] args) {
		Student s1 = new Student("Mittul");
		Student s2 = new Student("Rahul");
		Student s3 = new Student("Sagar");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}
}
