package example3;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo3 {
	public static void main(String[] args) {
		ConcurrentHashMap<Employee, Department> employeeConMap = new ConcurrentHashMap<>(16, 0.85f, 16);

		new Thread(new EmployeeTask(employeeConMap, "Sant", "IT")).run();
		new Thread(new EmployeeTask(employeeConMap, "Ram", "Sales")).run();
		new Thread(new EmployeeTask(employeeConMap, "Raheem", "Human Resource")).run();
		new Thread(new EmployeeTask(employeeConMap, "Gurmeet", "Management")).run();
		new Thread(new EmployeeTask(employeeConMap, "Singh", "Sales")).run();
		new Thread(new EmployeeTask(employeeConMap, "Insaan", "Data Science")).run();
		new Thread(new EmployeeTask(employeeConMap, "Danav", "Marketing")).run();
		new Thread(new EmployeeTask(employeeConMap, "Devta", "Management")).run();

		System.out.println(employeeConMap);

	}
}
