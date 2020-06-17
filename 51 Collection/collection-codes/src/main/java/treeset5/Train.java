package treeset5;


public class Train {
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

}
