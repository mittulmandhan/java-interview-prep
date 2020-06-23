package example3;

import java.util.concurrent.ConcurrentHashMap;

public class EmployeeTask implements Runnable {

	ConcurrentHashMap<Employee, Department> employeeConMap;
	String name, departmentName;

	public EmployeeTask(ConcurrentHashMap<Employee, Department> employeeConMap, String name, String departmentName) {
		this.employeeConMap = employeeConMap;
		this.name = name;
		this.departmentName = departmentName;
	}

	@Override
	public void run() {
		employeeConMap.put(new Employee(Employee.idCount++, name), new Department(departmentName));
	}

}
