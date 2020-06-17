package case5;

import java.util.HashSet;
import java.util.Set;

public class HashCodeOneEqualsGood {
	
	public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        
        e1.setId(100);
        e2.setId(100);
        
        
        System.out.println(e1.equals(e2));  //true
        
        Set<Employee> employees = new HashSet<Employee>();
        employees.add(e1);
        employees.add(e2);
        
        // equals returns true only if id of both e1 & e2
        // are same which means element already exist
        // and in this case e1 & e2 are having same id 
        // return is true
        // hence only one object will be added in the hashset i.e. e1
        // so one object will be printed
        System.out.println(employees);  //Prints one object

    }
	
}
