package set.treeset.example6;

import java.util.Comparator;

public class TrainDestinationComparartor implements Comparator<Train> {

	@Override
	public int compare(Train t1, Train t2) {
		return t1.getDestination().compareTo(t2.getDestination());
	}

}
