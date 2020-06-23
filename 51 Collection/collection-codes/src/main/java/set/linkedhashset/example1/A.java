package set.linkedhashset.example1;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class A {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		
		lhs.add(10);
		lhs.add(70);
		lhs.add(2);
		lhs.add(30);
		lhs.add(15);
		
		Iterator<Integer> i = lhs.iterator();
		
		// linked hash list follows input order i.e. First In First Out(FIFO) order
		// so it will print in the same order in which we inserted the values
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
