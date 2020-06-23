package example1;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo1 {
	public static void main(String[] args) {
		Map<Integer, String> ht = new Hashtable<>();

		ht.put(1, "space");
		ht.put(2, "galaxy");
		ht.put(3, "spaceship");
		ht.put(4, "planet");
		ht.put(5, "schrodinger");

		System.out.println(ht);
	}
}
