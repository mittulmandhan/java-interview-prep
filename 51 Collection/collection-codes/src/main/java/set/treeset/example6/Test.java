package set.treeset.example6;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

// comparator chaining to do

public class Test {
	public static void main(String[] args) {
		Comparator<Train> comp = new TrainNameComparator()
				.thenComparing(new TrainDepartureComparator())
				.thenComparing(new TrainSourceComparator())
				.thenComparing(new TrainDestinationComparartor());

		TreeSet<Train> trains = new TreeSet<>(comp);

		trains.add(new Train("Rajdhani", 1, "Delhi", "Raipur"));
		trains.add(new Train("Shatabdi", 4, "Bangalore", "Agra"));
		trains.add(new Train("Punjab Mail", 4, "Agra", "Delhi"));
		trains.add(new Train("Gareeb Rath", 10, "Mumbai", "Jammu Tawi"));
		trains.add(new Train("Rajdhani", 6, "Delhi", "Bangalore"));
		trains.add(new Train("Rajdhani", 6, "Delhi", "lonavala"));
		trains.add(new Train("Punjab Mail", 4, "Agra", "Raipur"));

		// fail fast mechannism
		Iterator<Train> i = trains.iterator();

		try {
			while (i.hasNext()) {
				Train train = i.next();
//				trains.add(new Train("Raji", 1, "Delhi", "Raipur"));
				System.out.println(train);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
