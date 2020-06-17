package equals_and_hashcode_overridden;

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
	
	public boolean equals(Object o) {
	    if(o == null) {
	        return false;
	    }
	    if (o == this) {
	        return true;
	    }
	    if (getClass() != o.getClass()) {
	        return false;
	    }
	     
	    Employee e = (Employee) o;
	    return (this.getId() == e.getId());
	}
	
	@Override
	public int hashCode() {
		return getId();
	}

}
