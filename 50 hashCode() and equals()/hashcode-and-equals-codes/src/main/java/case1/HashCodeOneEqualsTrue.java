package case1;

import java.util.HashSet;
import java.util.Set;


public class HashCodeOneEqualsTrue {
	public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        
        e1.setId(100);
        e2.setId(100);
        
        
        System.out.println(e1.equals(e2));  //true
        
        
        Set<Employee> employees = new HashSet<Employee>();
        employees.add(e1);
        employees.add(e2);
        
        // this statement will print two objects
        // because while adding hashset calls hashCode() and equals method
        // here hashCode() returns constant value always
        // whereas equals() returns true always
        // so only first element will be added
        // and all further adding attempts will fail 
        // because true(returned from equals()) means element already exist in hashset
        // so nothing will be added in hashset
        System.out.println(employees);  //Prints one object

    }

}
