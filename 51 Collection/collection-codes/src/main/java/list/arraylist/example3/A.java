package list.arraylist.example3;

import java.util.ArrayList;

// if we try to insert at an index which is greater than the length of the arraylist we will get IndexOutOfBoundException
// for eg: if the size of arraylist is 10 which means 0-9 index are holding some object
// and we can add a new element at the end of the list i.e. index 10
// but if we try to add element at index 11 this is the point where we go out of bound
// you can see the followong code as another example
public class A {
	public static void main(String[] args) {
		ArrayList<Object> l = new ArrayList<>();

		// 10 added at index 0
		l.add(10);// now size of arraylist is 1

		// we can at element at index 1
		// but we are adding element at index 2 which is out of bound
		// so we will get an exception
		l.add(2, "Java");

		System.out.println(l);
	}
}
