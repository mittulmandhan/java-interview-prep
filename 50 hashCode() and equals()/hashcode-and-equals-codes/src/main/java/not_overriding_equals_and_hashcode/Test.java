package not_overriding_equals_and_hashcode;

public class Test {
	
	public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        
        // e1 and e2 have same id i.e. they are holding the details of the same employee
        // but when we check the their equality using java.lang.Object.equals() method
        // we will get false which is incorrect according to our business logic
        e1.setId(100);
        e2.setId(100);
 
        System.out.println(e1.equals(e2));  //false
    }
	
}
