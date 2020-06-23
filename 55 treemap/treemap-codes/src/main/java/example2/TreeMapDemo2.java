package example2;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		Map<Employee, Department> employeeTreeMap = new TreeMap<>(new EmployeeComparator());

		employeeTreeMap.put(new Employee(1, "Sant"), new Department("IT"));
		employeeTreeMap.put(new Employee(2, "Ram"), new Department("Sales"));
		employeeTreeMap.put(new Employee(3, "Raheem"), new Department("Human Resource"));
		employeeTreeMap.put(new Employee(4, "Insaan"), new Department("Data Science"));
		employeeTreeMap.put(new Employee(5, "Danav"), new Department("Marketing"));
		employeeTreeMap.put(new Employee(6, "Devta"), new Department("Management"));

		System.out.println(employeeTreeMap);
	}

}
