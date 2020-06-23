package hashmap.example1;

import java.util.HashMap;

public class A {
	public static void main(String[] args) {
		HashMap<Student, String> hm = new HashMap<>();

		for (int i = 0; i < 64; i++) {
			hm.put(new Student(i + 1), "rahul");
		}

		System.out.println(hm);
	}
}
