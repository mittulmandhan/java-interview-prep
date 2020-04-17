package example2;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student("Mittul", 10);
		System.out.println(s1.getStudentName());
		System.out.println(s1.getStudentRoll());

		// this doesnt break immutability,
		// we assigned a new object to s1 reference variable
		// now old object is unreachable
		s1 = new Student("pawan", 23);

		Student s2 = new Student("Bheem", 11);
		System.out.println(s2.getStudentName());
		System.out.println(s2.getStudentRoll());
	}
}
