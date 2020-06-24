
package example7;

import java.util.ArrayList;
import java.util.List;

public class UnboundedGenericWildcard1 {

	void show(List<?> list) {
		System.out.println(list);
	}

	public static void main(String[] args) {
		// Generics with unbounded wildcard allows us to
		// pass any parameterized type
		// here we are passing parameterized type in List argument of show() method
		UnboundedGenericWildcard1 obj = new UnboundedGenericWildcard1();
		obj.show(new ArrayList<Integer>());
		obj.show(new ArrayList<String>());
		obj.show(new ArrayList<Employee>());
	}

}
