package example1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class ConcurrentHashMapDemo1 {
	public static void main(String[] args) {
		Map<Employee, Department> employeeConMap = new ConcurrentHashMap<>(16, 0.85f, 16);

		employeeConMap.put(new Employee(1, "Sant"), new Department("IT"));
		employeeConMap.put(new Employee(2, "Ram"), new Department("Sales"));
		employeeConMap.put(new Employee(3, "Raheem"), new Department("Human Resource"));
		employeeConMap.put(new Employee(4, "Insaan"), new Department("Data Science"));
		employeeConMap.put(new Employee(5, "Danav"), new Department("Marketing"));
		employeeConMap.put(new Employee(6, "Devta"), new Department("Management"));

		System.out.println(employeeConMap);

	}
}
