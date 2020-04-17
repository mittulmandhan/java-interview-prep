package example5;

public class PriceUtility {
	public void showPrice(Mobile m) {
		System.out.println(m.getPrice());
	}

	public void showPrice(Camera c) {
		System.out.println(c.getPrice());
	}

	public void showPrice(TV tv) {
		System.out.println(tv.getPrice());
	}
}
