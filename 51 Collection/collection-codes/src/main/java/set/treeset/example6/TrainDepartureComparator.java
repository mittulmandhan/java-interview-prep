package set.treeset.example6;

import java.util.Comparator;

public class TrainDepartureComparator implements Comparator<Train>{

	@Override
	public int compare(Train t1, Train t2) {
		return ((Integer)t1.getDeparture()).compareTo(t2.getDeparture());
	}
	

}
