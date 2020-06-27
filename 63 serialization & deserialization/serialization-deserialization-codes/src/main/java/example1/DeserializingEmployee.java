package example1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializingEmployee {

	private static void deserialize() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("Employee.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee emp = (Employee) ois.readObject();
		System.out.println("Got the employee");

		fis.close();
		ois.close();

		System.out.println(emp);
	}

	public static void main(String[] args) {
		try {
			deserialize();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
