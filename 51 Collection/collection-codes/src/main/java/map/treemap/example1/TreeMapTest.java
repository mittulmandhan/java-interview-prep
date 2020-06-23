package map.treemap.example1;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Key, String> treemap = new TreeMap<>();
		treemap.put(new Key("Anamika"), "Anamika");
		treemap.put(new Key("Rushika"), "Rushika");
		treemap.put(new Key("Dinesh"), "Dinesh");
		treemap.put(new Key("Arnav"), "Arnav");

		System.out.println(treemap);
	}

}

class Key implements Comparable<Key> {

	final int data = 112;
	private String key;

	public Key(String key) {
		super();
		this.key = key;
	}

	@Override
	public int compareTo(Key obj) {
		return key.compareTo(obj.key);
	}

	@Override
	public String toString() {
		return key;
	}

}
