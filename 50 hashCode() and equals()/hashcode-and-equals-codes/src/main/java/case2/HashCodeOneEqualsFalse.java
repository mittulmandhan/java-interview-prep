package case2;

import java.util.HashSet;
import java.util.Set;


public class HashCodeOneEqualsFalse {
	public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        
        e1.setId(100);
        e2.setId(100);
        
        
        System.out.println(e1.equals(e2));  //false
        
        
        Set<Employee> employees = new HashSet<Employee>();
        employees.add(e1);
        employees.add(e2);
        
        // now no matter what equals will return false
        // which means no duplicate in the hashset
        // so hashset will add the element already exist or not
        System.out.println(employees);  //Prints two objects

    }

}
