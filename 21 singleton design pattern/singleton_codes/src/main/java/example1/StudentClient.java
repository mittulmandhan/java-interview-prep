package example1;

public class StudentClient {
	public static void main(String[] args) {
		Student s1 = Student.getStudent();
		Student s2 = Student.getStudent();

		// s1 and s2 are same object
		System.out.println(s1);
		System.out.println(s2);
	}
}
