package case4;

import java.util.HashSet;
import java.util.Set;


public class HashCodeGoodEqualsFalse {
	public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        
        e1.setId(100);
        e2.setId(100);
        
        
        System.out.println(e1.equals(e2));  //false
        
        
        Set<Employee> employees = new HashSet<Employee>();
        employees.add(e1);
        employees.add(e2);
        
        // here add() method will add the elements
        // since equals() returning false always which means
        // element does not already exist for always
        System.out.println(employees);  //Prints two objects

    }

}
