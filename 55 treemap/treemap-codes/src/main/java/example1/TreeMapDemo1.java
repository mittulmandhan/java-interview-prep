package example1;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();

		tm.put("icecream", 5);
		tm.put("chocolate", 7);
		tm.put("waffer", 4);
		tm.put("waffer", 6);// this is the updated value of waffer
		tm.put("faluda", 12);

		for (Entry<String, Integer> entry : tm.entrySet()) {
			System.out.println("There are " + entry.getValue() + " " + entry.getKey());
		}
	}
}
