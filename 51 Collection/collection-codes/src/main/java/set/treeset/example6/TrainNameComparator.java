package set.treeset.example6;

import java.util.Comparator;

public class TrainNameComparator implements Comparator<Train>{

	@Override
	public int compare(Train t1, Train t2) {
		return t1.getName().compareTo(t2.getName());
	}

	
}
