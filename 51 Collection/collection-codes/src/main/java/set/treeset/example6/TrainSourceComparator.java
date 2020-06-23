package set.treeset.example6;

import java.util.Comparator;

public class TrainSourceComparator implements Comparator<Train>{

	@Override
	public int compare(Train t1, Train t2) {
		return t1.getSource().compareTo(t2.getSource());
	}

}
