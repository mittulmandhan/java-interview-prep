package example5;

public class Mobile extends Price {

	private int price;

	public Mobile(int price) {
		this.price = price;
	}

	@Override
	public int getPrice() {
		return this.price;
	}
}
