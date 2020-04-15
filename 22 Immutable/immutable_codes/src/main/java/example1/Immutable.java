// here we have created an immutable class

package example1;

public final class Immutable {
	private final int x;

	public Immutable(int x) {
		this.x = x;
	}

	public String convertToString() {
		return "" + x;
	}

	public static void main(String[] args) {
		Immutable i = new Immutable(5);
		System.out.println(i.convertToString());// 5

		i = new Immutable(6);
		System.out.println(i.convertToString());// 6
	}
}