package example2;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student("Mittul", 10);
		System.out.println(s1.getStudentName());
		System.out.println(s1.getStudentRoll());

		Student s2 = new Student("Bheem", 11);
		System.out.println(s2.getStudentName());
		System.out.println(s2.getStudentRoll());
	}
}
