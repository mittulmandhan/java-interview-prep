package set.treeset.example5;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		Comparator<Train> comp = new TrainComparator();

		TreeSet<Train> trains = new TreeSet<>(comp);

		trains.add(new Train("Rajdhani", 1, "Delhi", "Raipur"));
		trains.add(new Train("Shatabdi", 4, "Bangalore", "Agra"));
		trains.add(new Train("Punjab Mail", 4, "Agra", "Delhi"));
		trains.add(new Train("Gareeb Rath", 10, "Mumbai", "Jammu Tawi"));
		trains.add(new Train("Rajdhani", 6, "Delhi", "Bangalore"));
		trains.add(new Train("Rajdhani", 6, "Delhi", "Bangalore"));
		trains.add(new Train("Punjab Mail", 4, "Agra", "Raipur"));

		// fail fast mechannism
		Iterator<Train> i = trains.iterator();

		try {
			while (i.hasNext()) {
				Train t = i.next();
				trains.add(new Train("Raji", 1, "Delhi", "Raipur"));
				System.out.println(t.getName() + " " + t.getDeparture() + " " + t.getSource() + " " + t.getDestination());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
