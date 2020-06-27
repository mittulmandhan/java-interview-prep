package example1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializingEmployee {

	private static void serialize(Employee emp) throws IOException {
		FileOutputStream fos = new FileOutputStream("Employee.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		System.out.println("Employee saved");

		oos.writeObject(emp);

		fos.close();
		oos.close();
	}

	public static void main(String[] args) {
		Employee emp = new Employee("Mittul", 22, 101, 20000);

		try {
			serialize(emp);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
