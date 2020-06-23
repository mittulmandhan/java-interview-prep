package set.treeset.example6;

public class ArrayDemo {
	public static void main(String[] args) {
//		<data_type> <var_name>;

		int x;
		x = 1;

		// declaration of int array variable i.e. arr
		int arr[];
		// initialization of int array variable i.e. arr
		// int array of size 10 will be created in heap
		// then its reference is assigned to arr
		arr = new int[10];

		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		int arr3[] = new int[] { 10, 23, 8, 24 };
//		int arr4[10];

		Student student;
		student = new Student();

		// declaration of student array variable i.e. stud
		Student stud[];
		// initialization of student array variable i.e. stud
		// Student array of size 10 will be created in heap
		// then its reference is assigned to stud
		stud = new Student[10];

//		Student[]
//		Array<Student>
//		[]Student
		

	}
}

class Student {

}