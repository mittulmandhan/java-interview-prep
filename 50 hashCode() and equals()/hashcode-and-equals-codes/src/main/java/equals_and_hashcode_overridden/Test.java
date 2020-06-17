package equals_and_hashcode_overridden;

import java.util.HashSet;
import java.util.Set;

public class Test {
	
	public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        
        e1.setId(100);
        e2.setId(100);
        
        
        System.out.println(e1.equals(e2));  //true
        
        // Now that we have overriding hashCode() method too
        // e1 and e2 will be considered deeply equal
        // according to our logic
        Set<Employee> employees = new HashSet<Employee>();
        employees.add(e1);
        employees.add(e2);
        
        // now this statement will print only one object
        System.out.println(employees);  //Prints two objects

    }
	
}
