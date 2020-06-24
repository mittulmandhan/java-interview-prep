
package example11;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedGenericWildcard2 {

	public static void main(String[] args) {
		// List of apples
		List<Apple> apples = new ArrayList<Apple>();
		apples.add(new Apple());

		// We can assign a list of apples to a basket of apples
		List<? super Apple> basket = apples;

		basket.add(new Apple()); // Successful
		basket.add(new AsianApple()); // Successful
		basket.add(new Fruit()); // Compile time error
	}

}

class Fruit {
	@Override
	public String toString() {
		return "I am a Fruit !!";
	}
}

class Apple extends Fruit {
	@Override
	public String toString() {
		return "I am an Apple !!";
	}
}

class AsianApple extends Apple {
	@Override
	public String toString() {
		return "I am an AsianApple !!";
	}
}