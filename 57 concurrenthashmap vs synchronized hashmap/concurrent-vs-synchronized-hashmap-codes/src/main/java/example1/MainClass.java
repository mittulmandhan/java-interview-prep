package example1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// In this code we have used synchronized hashmap
// There is a likelihood of ConcurrentModificationException
public class MainClass {

	public static void main(String[] args) {
		Map<String, Integer> hashmap = new HashMap<>();
		Map<String, Integer> syncMap = Collections.synchronizedMap(hashmap);
		MapHelper1 mapHelper1 = new MapHelper1(syncMap);
		MapHelper2 mapHelper2 = new MapHelper2(syncMap);
		MapHelper3 mapHelper3 = new MapHelper3(syncMap);
		MapHelper4 mapHelper4 = new MapHelper4(syncMap);

		for (Map.Entry<String, Integer> entry : syncMap.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}

}
