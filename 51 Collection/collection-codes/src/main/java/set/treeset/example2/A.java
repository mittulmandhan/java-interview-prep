package set.treeset.example2;

import java.util.Iterator;
import java.util.TreeSet;

public class A {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>((i,j)-> i.compareToIgnoreCase(j));
		
		ts.add("Mittul");
		ts.add("mittum");
		ts.add("aman");
		ts.add("pawan");
		ts.add("Tarun");
		ts.add("Nikhil");
		ts.add("bheeshm");
		ts.add("bharat");
		
		Iterator<String> i = ts.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
