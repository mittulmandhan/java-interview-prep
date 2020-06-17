package equals_overridden_not_hashcode;

public class Test {
	
	public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        
        e1.setId(100);
        e2.setId(100);
        
        
        // In result of we customizing equals method
        // according to our business logic
        // we will get true when comparing e1 and e2
        // since they are having same id
        System.out.println(e1.equals(e2));  //true
        
        // but still there is a problem
        // which we will look into in next code
    }
	
}
