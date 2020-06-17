package treeset3;

import java.util.Iterator;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		TreeSet<Movie> ts = new TreeSet<>();

		ts.add(new Movie("Tamasha", 2.58, 2018));
		ts.add(new Movie("Yarana", 3.16, 1980));
		ts.add(new Movie("Tohfa", 3.22, 1958));
		ts.add(new Movie("Khamoshiyan", 2.22, 2014));
		ts.add(new Movie("Kahani", 2.00, 2015));

		Iterator<Movie> i = ts.iterator();

		while (i.hasNext()) {
			Movie m = i.next();
			System.out.println(m.getName() + " " + m.getDuration() + " " + m.getYear());
		}
	}
}
