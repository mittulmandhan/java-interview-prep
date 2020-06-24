
package example10;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedGenericWildcard1 {

	public static void main(String[] args) {
		// List of grand children
		List<GrandChildClass> grandChildren = new ArrayList<GrandChildClass>();
		grandChildren.add(new GrandChildClass());
		addGrandChildren(grandChildren);

		// List of grand childs
		List<ChildClass> childs = new ArrayList<ChildClass>();
		childs.add(new GrandChildClass());
		addGrandChildren(childs);

		// List of grand supers
		List<SuperClass> supers = new ArrayList<SuperClass>();
		supers.add(new GrandChildClass());
		addGrandChildren(supers);
	}

	public static void addGrandChildren(List<? super GrandChildClass> grandChildren) {
		grandChildren.add(new GrandChildClass());
		System.out.println(grandChildren);

		for (Object element : grandChildren) {
			System.out.println(element);
		}
	}

}

class SuperClass {

}

class ChildClass extends SuperClass {

}

class GrandChildClass extends ChildClass {

}