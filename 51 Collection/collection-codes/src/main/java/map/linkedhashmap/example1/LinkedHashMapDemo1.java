package map.linkedhashmap.example1;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo1 {
	public static void main(String[] args) {
		LinkedHashMap<String, String> hm = new LinkedHashMap<>();

		hm.put("a", "mittul");
		hm.put("f", "pawan");
		hm.put("j", "raj");
		hm.put("d", "rahul");

		Set<String> keySet = hm.keySet();

		for (String key : keySet) {
			System.out.println(key + ": " + hm.get(key));
		}

	}
}
