package set.treeset.example3;

public class Movie implements Comparable<Movie> {
	private int year;
	private double duration;
	private String name;

	public Movie(String name, double duration, int year) {
		this.name = name;
		this.duration = duration;
		this.year = year;
	}

	@Override
	public int compareTo(Movie m) {
		if(this.getYear() == m.getYear()) {
			return 0;
		}
		return (-9)*((Integer)this.getYear()).compareTo(m.getYear());
	}

	public double getDuration() {
		return duration;
	}

	public String getName() {
		return name;
	}
	
	public int getYear() {
		return year;
	}

}
