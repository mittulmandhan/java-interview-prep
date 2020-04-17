package example5;

public class TV extends Price {

	private int price;

	public TV(int price) {
		this.price = price;
	}

	@Override
	public int getPrice() {
		return price;
	}

}
