package hashmap.example3;

import java.util.HashMap;
import java.util.Iterator;

public class A {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();

		hm.put("m", "mittul");
		hm.put("a", "aryan");
		hm.put("r", "rahul");
		hm.put("c", "chetan");

		Iterator<String> i = hm.keySet().iterator();

		while (i.hasNext()) {
			System.out.println(i.next() + " = " + hm.get(i.next()));
		}
	}
}
