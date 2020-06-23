package set.treeset.example5;

import java.util.Comparator;

public class TrainComparator implements Comparator<Train> {
	
	private int compareName(Train t1, Train t2) {
		return t1.getName().compareTo(t2.getName());
	}
	
	private int compareDeparture(Train t1, Train t2) {
		return ((Integer)t1.getDeparture()).compareTo(t2.getDeparture());
	}
	
	private int compareSource(Train t1, Train t2) {
		return t1.getSource().compareTo(t2.getSource());
	}
	
	private int compareDestination(Train t1, Train t2) {
		return t1.getDestination().compareTo(t2.getDestination());
	}

	@Override
	public int compare(Train t1, Train t2) {
		
		if(compareName(t1, t2) == 0 && compareDeparture(t1, t2) == 0 && compareSource(t1, t2) == 0) {
			return compareDestination(t1, t2);
		}
		
		if(compareName(t1, t2) == 0 && compareDeparture(t1, t2) == 0) {
			return compareSource(t1, t2);
		}
		
		if(compareName(t1, t2) == 0) {
			return compareDeparture(t1, t2);
		}
		
		return compareName(t1, t2);
	}

}
