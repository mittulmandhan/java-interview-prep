package example2;

public class Square {
	private static Square square;
	int x;

	static {
		square = new Square();
	}

	private Square() {
	}

	static Square getInstance() {
		return square;
	}

	int getResult() {
		return x * x;
	}
}