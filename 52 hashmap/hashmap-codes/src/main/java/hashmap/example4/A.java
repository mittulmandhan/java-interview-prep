package hashmap.example4;

import java.util.HashMap;
import java.util.Map.Entry;

public class A {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();

		hm.put("m", "mittul");
		hm.put("a", "aryan");
		hm.put("r", "rahul");
		hm.put("c", "chetan");

		for (Entry<String, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}