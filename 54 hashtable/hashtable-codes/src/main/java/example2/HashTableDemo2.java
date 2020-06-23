package example2;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo2 {

	public static void main(String[] args) {
		Map<Employee, Department> employeeHashTable = new Hashtable<>();

		employeeHashTable.put(new Employee(1, "Sant"), new Department("IT"));
		employeeHashTable.put(new Employee(2, "Ram"), new Department("Sales"));
		employeeHashTable.put(new Employee(3, "Raheem"), new Department("Human Resource"));
		employeeHashTable.put(new Employee(4, "Insaan"), new Department("Data Science"));
		employeeHashTable.put(new Employee(5, "Danav"), new Department("Marketing"));
		employeeHashTable.put(new Employee(6, "Devta"), new Department("Management"));

		System.out.println(employeeHashTable);
	}

}
