package example2;

public class GenericClass<T> {

	private T x;

	public GenericClass(T x) {
		this.x = x;
	}

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

}
