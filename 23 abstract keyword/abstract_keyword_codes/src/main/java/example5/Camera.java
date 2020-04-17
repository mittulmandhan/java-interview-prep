package example5;

public class Camera extends Price {

	private int price;

	public Camera(int price) {
		this.price = price;
	}

	@Override
	public int getPrice() {
		return price;
	}

}
