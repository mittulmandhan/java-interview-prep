package example1;

import java.util.ArrayList;
import java.util.List;

public class UnderstandingTypeSafety {

	public static void main(String[] args) {
		// we have passed Integer type in ArrayList
		// so on this object of ArrayList
		// we can only perform operations on Integer
		List<Integer> list = new ArrayList<>();

		// We here passed an argument of type int
		// which will be boxed into Integer Wrapper class
		// so this statement is valid
		list.add(10);

		// We here passed an argument of type String
		// which is not allowed
		// since we can only perform operations on Integer type
		// list.add("Mittul");
	}

}
