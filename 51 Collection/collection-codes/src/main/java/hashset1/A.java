package hashset1;

import java.util.HashSet;
import java.util.Iterator;

public class A {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(2);
		hs.add(10);
		hs.add(1);
		hs.add(100);
		hs.add(12);
		
		Iterator<Integer> i = hs.iterator();
		
		
		// hashset does not follow any order
		// it will print the values in random order
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
	}
}
