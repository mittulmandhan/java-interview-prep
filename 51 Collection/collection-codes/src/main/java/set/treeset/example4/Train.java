package set.treeset.example4;


public class Train implements Comparable<Train>{
	private String name;
	private int departure;
	private String source;
	private String destination;

	public Train(String name, int departure, String source, String destination) {
		this.name = name;
		this.departure = departure;
		this.source = source;
		this.destination = destination;
	}

	public String getName() {
		return name;
	}

	public int getDeparture() {
		return departure;
	}

	public String getSource() {
		return source;
	}

	public String getDestination() {
		return destination;
	}

	@Override
	public int compareTo(Train t) {
		
		if(this.getName().compareTo(t.getName()) == 0 && ((Integer)this.getDeparture()).compareTo(t.getDeparture()) == 0 && this.getSource().compareTo(t.getSource()) == 0) {
			return this.getDestination().compareTo(t.getDestination());
		}
		
		if(this.getName().compareTo(t.getName()) == 0 && ((Integer)this.getDeparture()).compareTo(t.getDeparture()) == 0) {
			return this.getSource().compareTo(t.getSource());
		}
		
		if(this.getName().compareTo(t.getName()) == 0) {
			return ((Integer)this.getDeparture()).compareTo(t.getDeparture());
		}
		
		return this.getName().compareTo(t.getName());
	}
}
