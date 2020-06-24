package example5;

public class GenericArrayDemo1<T> {

	T[] arr;

	public static void main(String[] args) {

		GenericArrayDemo1<Integer> arrDemo = new GenericArrayDemo1<>();

		// it is not allowed to make String array object
		// because we have declared the type to Integer
		// arrDemo.arr = new String[10];

		// it is correct
		arrDemo.arr = new Integer[2];

		arrDemo.arr[0] = 12;
		arrDemo.arr[1] = 7;

		System.out.println(arrDemo.arr[0]);
		System.out.println(arrDemo.arr[1]);

	}

}
