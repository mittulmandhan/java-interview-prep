package case3;

import java.util.HashSet;
import java.util.Set;


public class HashCodeGoodEqualsTrue {
	public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        
        e1.setId(100);
        e2.setId(100);
        
        
        System.out.println(e1.equals(e2));  //true
        
        
        Set<Employee> employees = new HashSet<Employee>();
        employees.add(e1);
        employees.add(e2);
        
        // again equals method returning true always 
        // so first element is added and further rejected
        // because true from equals meaning element already exists
        System.out.println(employees);  //Prints one object

    }

}
