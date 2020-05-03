# Arrays Class
* Arrays class is inside java.util package.
* Arrays class extends Object class.
* It is a part of __Collection Framework__.
* This class consists of public static methods only. These methods provide performing searching, sorting and filling an array.
* we don't need to create an object Arrays class neither we can.
* Since methods of Arrays class are static they can be accessed by using class name.<br>
  `Arrays.<function name>;`
* __Class Declaration:__<br>
`public class Arrays extends Object`
* __Need for Arrays class in Java:__
  - Fill an array with a particular value
  - Sort an array
  - Search in an array
  - And more.


## Methods in Java Array
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

4. __compareUnsigned(array1, array2):__ This method compares two arrays lexicographically, numerically treating elements as unsigned.
5. __copyOf(originalArray, newLength):__ This method copies the specified array, truncating or padding with the default value (if necessary) so the copy has the specified length.
6. __deepEquals(Object[] a1, Object[] a2):__ This method returns true if the two specified arrays are deeply equal to one another.
7. __deepHashCode(Object[] a):__ This method returns a hash code based on the “deep contents” of the specified Arrays.
8. __deepToString(Object[] a):__ This method returns a string representation of the “deep contents” of the specified Arrays.
9. __equals(array1, array2):__ This method checks if both the arrays are equal or not.
10. __fill(originalArray, fillValue):__ This method assigns this fillValue to each index of this Arrays.
11. __hashCode(originalArray):__ This method returns an integer hashCode of this array instance.
12. __mismatch(array1, array2):__ This method finds and returns the index of the first unmatched element between the two specified arrays.
13. __parallelPrefix(originalArray, from, to, functionalOperator):__ This method performs parallelPrefix for the given range of the array with the specified functional operator.
14. __parallelPrefix(originalArray, functionalOperator):__ This method performs parallelPrefix for complete array with the specified functional operator.
15. __parallelSetAll(originalArray, functionalGenerator):__ This method set all the elements of this array in parallel, using the provided generator function.
16. __parallelSort(originalArray):__ This method sorts the specified array using parallel sort.
17. __setAll(originalArray, functionalGenerator):__ This method sets all the element of the specified array using the generator function provided.
18. __sort(originalArray):__ This method sorts the complete array in ascending order.
19. __sort(originalArray, fromIndex, endIndex):__ This method sorts the specified range of array in ascending order.
20. __static <T> void sort(T[] a, int from, int to, Comparator< super T> c):__ This method sorts the specified range of the specified array of objects according to the order induced by the specified comparator.
21. __static <T> void sort(T[] a, Comparator< super T> c):__ This method sorts the specified array of objects according to the order induced by the specified comparator.
22. __spliterator(originalArray):__ This method returns a Spliterator covering all of the specified Arrays.
23. __spliterator(originalArray, from, to):__ This method returns a Spliterator of the type of the array covering the specified range of the specified Arrays.
24. __stream(originalArray):__ This method returns a sequential stream with the specified array as its source.
25. __toString(originalArray):__ This method returns a String representation of the contents of this Arrays. The string representation consists of a list of the array’s elements, enclosed in square brackets (“[]”). Adjacent elements are separated by the characters a comma followed by a space. Elements are converted to strings as by String.valueOf() function.
