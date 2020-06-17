package equals_overridden_not_hashcode;

public class Employee {
	private Integer id;
    private String firstname;
    private String lastName;
    private String department;
    
    
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	// Here we are overriding equals method
	// according to our logic
	// so we will get true when id of 2 Employee objects
	// are same
	public boolean equals(Object o) {
	    if(o == null)
	    {
	        return false;
	    }
	    if (o == this)
	    {
	        return true;
	    }
	    if (getClass() != o.getClass())
	    {
	        return false;
	    }
	     
	    Employee e = (Employee) o;
	    return (this.getId() == e.getId());
	}


}
