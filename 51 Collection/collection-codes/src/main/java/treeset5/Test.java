package treeset5;

import java.util.Iterator;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		TreeSet<Train> trains = new TreeSet<>(new TrainComparator());
		
		trains.add(new Train("Rajdhani", 1, "Delhi", "Raipur"));
		trains.add(new Train("Shatabdi", 4, "Bangalore", "Agra"));
		trains.add(new Train("Punjab Mail", 4, "Agra", "Delhi"));
		trains.add(new Train("Gareeb Rath", 10, "Mumbai", "Jammu Tawi"));
		trains.add(new Train("Rajdhani", 6, "Delhi", "Bangalore"));
		trains.add(new Train("Rajdhani", 6, "Delhi", "Bangalore"));
		trains.add(new Train("Punjab Mail", 4, "Agra", "Raipur"));
		
		Iterator<Train> i = trains.iterator();
		
		while (i.hasNext()) {
			Train t = i.next();
			System.out.println(t.getName()+" "+t.getDeparture()+" "+t.getSource()+" "+t.getDestination());
		}
	}
}
