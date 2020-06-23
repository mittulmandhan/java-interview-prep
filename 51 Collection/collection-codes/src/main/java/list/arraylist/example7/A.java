package list.arraylist.example7;

import java.util.ArrayList;
import java.util.HashMap;

public class A {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList l = new ArrayList();

		l.add(10);
		l.add("Java");
		l.add(1, 20);

		// if we try to get the value from the index greater than size-1
		// we will get IndexOutOfBoundException
		System.out.println(l.get(3));

		HashMap<String, String> map = new HashMap<>();
		map.put("1", "pawan");
	}
}