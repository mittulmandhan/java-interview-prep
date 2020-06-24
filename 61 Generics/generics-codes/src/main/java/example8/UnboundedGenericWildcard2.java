
package example8;

import java.util.ArrayList;
import java.util.List;

public class UnboundedGenericWildcard2 {

	public static void main(String[] args) {
		// Generics with unbounded wildcard allows us to
		// pass any parameterized type
		List<?> list = new ArrayList<Integer>();
		List<?> list1 = new ArrayList<String>();
		List<?> list2 = new ArrayList<Employee>();
	}

}
