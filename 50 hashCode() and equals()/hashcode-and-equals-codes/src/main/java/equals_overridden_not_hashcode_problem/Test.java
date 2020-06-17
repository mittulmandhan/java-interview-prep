package equals_overridden_not_hashcode_problem;

import java.util.HashSet;
import java.util.Set;

public class Test {
	
	public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        
        e1.setId(100);
        e2.setId(100);
        
        
        
        System.out.println(e1.equals(e2));  //true
        
        
        // Now that we are using hash based data structure
        // We will get to know what problem we can face
        // when overriding only equals() and not the hashCode() method
        Set<Employee> employees = new HashSet<Employee>();
        employees.add(e1);
        employees.add(e2);
        
        // this print statement will print two objects
        // Despite the fact that e1 and e2 must be considered
        // to be the same object according to our business logic
        System.out.println(employees);  //Prints two objects

    }
	
}
