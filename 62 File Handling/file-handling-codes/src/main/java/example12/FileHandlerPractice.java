package example12;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlerPractice {
	public static void main(String[] args) throws IOException {
		File file = new File("Z:\\Study\\java-interview-prep\\62 File Handling\\file-handling-files\\Employees.txt");
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		Employee[] employees = new Employee[3];
		employees[0] = new Employee("Mittul", "mittul@gmail.com", 23);
		employees[1] = new Employee("Pawan", "pawan@gmail.com", 30);
		employees[2] = new Employee("Rahul", "rahul@gmail.com", 22);

		writer.write("Employee\tEmail\tAge\n");
		for (Employee employee : employees) {
			writer.write(employee.toString() + "\n");
		}
		writer.flush();

		FileReader reader = new FileReader(file);

		int x = 0;
		while ((x = reader.read()) != -1) {
			System.out.print((char) x);
		}

		reader.close();
		writer.close();

	}
}

class Employee {
	private final String name;
	private final String email;
	private final int age;

	public Employee(String name, String email, int age) {
		this.name = name;
		this.email = email;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "\t" + email + " " + age;
	}

}
