package set.treeset.example1;

import java.util.Iterator;
import java.util.TreeSet;

public class A {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(10);
		ts.add(17);
		ts.add(1);
		ts.add(80);
		ts.add(7);
		
		Iterator<Integer> i = ts.iterator();
		
		// treeset stores values in sorted order
		// by default it will print values in increasing order
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
