package example5;

public class Test extends PriceUtility {
	public static void main(String[] args) {
		Mobile m = new Mobile(1000);
		Camera c = new Camera(5000);
		TV tv = new TV(10000);

		Test t = new Test();
		t.showPrice(m);
		t.showPrice(c);
		t.showPrice(tv);
	}
}
