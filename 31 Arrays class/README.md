# Arrays Class
* Arrays class is inside java.util package.
* Arrays class extends Object class.
* It is a part of __Collection Framework__.
* This class consists of public static methods only. These methods provide performing searching, sorting and filling an array.
* we don't need to create an object of Arrays class neither we can.
* Since methods of Arrays class are static they can be accessed by using class name.<br>
  `Arrays.<function name>;`
* __Class Declaration:__<br>
`public class Arrays extends Object`
* __Need for Arrays class in Java:__
  - Fill an array with a particular value
  - Sort an array
  - Search in an array
  - And more.


## Methods in Java Arrays
1. __static <T> List<T> asList(T… a):__ This method returns a fixed-size list backed by the specified Arrays.
````
public class A {
	public static void main(String[] args) {
		int[][] arr = { { 34, 23, 28, 6, 11, 35, 16 }, { 7, 34, 8, 10 } };
		List<int[]> ll = Arrays.asList(arr);
    for (int[] is : ll) {
			for (int i : is) {
				System.out.println(i);
			}
		}
	}
}
````
__output:__
````
34
23
28
6
11
35
16
7
34
8
10
````
2. __static <T> int binarySearch(T[] a, int from, int to, T key, Comparator<T> c):__ This method searches a range of the specified array for the specified object using the binary search algorithm.
````
public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		Arrays.sort(arr);
		System.out.println(Arrays.binarySearch(arr, 34));
	}
}
````
__output:__
````
5
````
3. __compare(array1, array2):__ This method compares two arrays passed as parameters lexicographically.
````
public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		int[] arr2 = { 15, 23, 9, 16 };
		System.out.println(Arrays.compare(arr, arr2));
	}
}
````
__output:__
````
gives error
````
4. __compareUnsigned(array1, array2):__ This method compares two arrays lexicographically, numerically treating elements as unsigned.
````
public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		int[] arr2 = { 15, 23, 9, 16 };
		System.out.println(Arrays.compareUnsigned(arr, arr2));
	}
}
````
__output:__
````
gives error
````
5. __copyOf(originalArray, newLength):__ This method copies the specified array, truncating or padding with the default value (if necessary) so the copy has the specified length.
````
	public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		int[] copyArr = Arrays.copyOf(arr, 7);
		for (int i : copyArr) {
			System.out.println(i);
		}
	}
}
````
__output:__
````
34
23
28
6
11
35
16
````
6. __deepEquals(Object[] a1, Object[] a2):__ This method returns true if the two specified arrays are deeply equal to one another.
````
	public class A {
	public static void main(String[] args) {
		B[] arr = { new B(),new B(7), new B(17) };
		B[] arr2 = { new B(),new B(7), new B(17) };
		System.out.println(Arrays.deepEquals(arr, arr2));
	}
}
````
````
public class B {
	int x;

	B() {
		x = 0;
	}

	B(int x) {
		this.x = x;
	}
}
````
__output:__
````
false
````
7. __deepHashCode(Object[] a):__ This method returns a hash code based on the “deep contents” of the specified Arrays.
````
public class A {
	public static void main(String[] args) {
		B[] arr = { new B(), new B(7), new B(17) };
		System.out.println(Arrays.deepHashCode(arr));
	}
}
````
````
public class B {
	int x;
	B() {
		x = 0;
	}
	B(int x) {
		this.x = x;
	}
}
````
__output:__
````
-1183176409
````
8. __deepToString(Object[] a):__ This method returns a string representation of the “deep contents” of the specified Arrays.
````
public class A {
	public static void main(String[] args) {
		B[] arr = { new B(), new B(7), new B(17) };
		System.out.println(Arrays.deepToString(arr));
	}
}
````
````
public class B {
	int x;
	B() {
		x = 0;
	}
	B(int x) {
		this.x = x;
	}

}
````
__output:__
````
[example8.B@6d06d69c, example8.B@7852e922, example8.B@4e25154f]
````
9. __equals(array1, array2):__ This method checks if both the arrays are equal or not.
````
public class A {
	public static void main(String[] args) {
		B[] arr = { new B(),new B(7), new B(17) };
		B[] arr2 = { new B(),new B(7), new B(17) };
		System.out.println(Arrays.equals(arr, arr2));
	}
}
````
````
public class B {
	int x;
	B() {
		x = 0;
	}
	B(int x) {
		this.x = x;
	}
}
````
__output:__
````
false
````
10. __fill(originalArray, fillValue):__ This method assigns this fillValue to each index of the Array.
````
public class A {
	public static void main(String[] args) {
		int[] arr = {0, 0, 0, 0, 0, 0};
		Arrays.fill(arr, 10);
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
````
__output:__
````
10
10
10
10
10
10
````
11. __hashCode(originalArray):__ This method returns an integer hashCode of the array instance.
````
public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		System.out.println(arr);
	}
}
````
__output:__
````
[I@15db9742

````
12. __mismatch(array1, array2):__ This method finds and returns the index of the first unmatched element between the two specified arrays.
````
public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		int[] arr2 = { 15, 23, 9, 16 };
		System.out.println(Arrays.mismatch(arr, arr2));
	}
}
````
__output:__
````
gives error
````
13. __parallelPrefix(originalArray, from, to, functionalOperator):__ This method performs parallelPrefix for the given range of the array with the specified functional operator.
````
public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		Arrays.parallelPrefix(arr, 2, 5, (x,y) -> x+y);
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
````
__output:__
````
34
23
28
34
45
35
16
````
14. __parallelPrefix(originalArray, functionalOperator):__ This method performs parallelPrefix for complete array with the specified functional operator.
````
public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		Arrays.parallelPrefix(arr, (x, y) -> x + y);
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
````
__output:__
````
34
57
85
91
102
137
153
````
15. __parallelSetAll(originalArray, functionalGenerator):__ This method set all the elements of this array in parallel, using the provided generator function.
````
public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		Arrays.parallelSetAll(arr, (x) -> arr[x] + 2);
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
````
__output:__
````
36
25
30
8
13
37
18
````
16. __parallelSort(originalArray):__ This method sorts the specified array using parallel sort.
````
public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		Arrays.parallelSort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
````
__output:__
````
6
11
16
23
28
34
35
````
17. __setAll(originalArray, functionalGenerator):__ This method sets all the element of the specified array using the generator function provided.
````
public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		Arrays.setAll(arr, (x) -> arr[x] * 2);
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
````
__output:__
````
68
46
56
12
22
70
32
````
18. __sort(originalArray):__ This method sorts the complete array in ascending order.
````
public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
````
__output:__
````
6
11
16
23
28
34
35
````
19. __sort(originalArray, fromIndex, endIndex):__ This method sorts the specified range of array in ascending order.
````
public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		Arrays.sort(arr, 2, 6);
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
````
__output:__
````
34
23
6
11
28
35
16
````
20. __static <T> void sort(T[] a, int from, int to, Comparator< super T> c):__ This method sorts the specified range of the specified array of objects according to the order induced by the specified comparator.
````
public class A {
	public static void main(String[] args) {
		B[] arr = { new B(34), new B(28), new B(6), new B(11), new B(35), new B(16) };
		Arrays.sort(arr, 3, 6, new Sorter());
		for (B i : arr) {
			System.out.println(i.x);
		}
	}
}

class Sorter implements Comparator<B> {
	@Override
	public int compare(B o1, B o2) {
		return o2.x - o1.x;
	}

}
````
````
public class B {
	int x;
	B() {
		x = 0;
	}
	B(int x) {
		this.x = x;
	}
}
````
__output:__
````
34
28
6
35
16
11
````
21. __static <T> void sort(T[] a, Comparator< super T> c):__ This method sorts the specified array of objects according to the order induced by the specified comparator.
````
public class A {
	public static void main(String[] args) {
		B[] arr = { new B(34), new B(28), new B(6), new B(11), new B(35), new B(16) };
		Arrays.sort(arr, new Sorter());
		for (B i : arr) {
			System.out.println(i.x);
		}
	}
}

class Sorter implements Comparator<B> {
	@Override
	public int compare(B o1, B o2) {
		return o2.x - o1.x;
	}

}
````
````
public class B {
	int x;
	B() {
		x = 0;
	}
	B(int x) {
		this.x = x;
	}
}
````
__output:__
````
35
34
28
16
11
6
````
22. __spliterator(originalArray):__ This method returns a Spliterator covering all of the specified Arrays.
````
public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		Spliterator<?> s = Arrays.spliterator(arr);
		s.forEachRemaining((x) -> System.out.println(x));
	}
}
````
__output:__
````
34
23
28
6
11
35
16
````
23. __spliterator(originalArray, from, to):__ This method returns a Spliterator of the type of the array covering the specified range of the specified Arrays.
````
public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		Spliterator<?> s = Arrays.spliterator(arr,2,6);
		s.forEachRemaining((x) -> System.out.println(x));
	}
}
````
__output:__
````
28
6
11
35
````
24. __stream(originalArray):__ This method returns a sequential stream with the specified array as its source.
````
public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		IntStream i = Arrays.stream(arr);
		i.forEach((x) -> System.out.println(x));
	}
}
````
__output:__
````
34
23
28
6
11
35
16
````
25. __toString(originalArray):__ This method returns a String representation of the contents of this Arrays. The string representation consists of a list of the array’s elements, enclosed in square brackets (“[]”). Adjacent elements are separated by the characters a comma followed by a space. Elements are converted to strings as by String.valueOf() function.
````
public class A {
	public static void main(String[] args) {
		int[] arr = { 34, 23, 28, 6, 11, 35, 16 };
		System.out.println(Arrays.toString(arr));
	}
}
````
__output:__
````
[34, 23, 28, 6, 11, 35, 16]
````
