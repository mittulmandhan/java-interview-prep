package example4;

import java.io.File;

public class FileHandlingMethods {

	public static void main(String[] args) {
		// you can replacing the file a.txt with the folder ab
		// and check how code works
		File f = new File("Z:\\Study\\java-interview-prep\\62 File Handling\\file-handling-files\\a.txt");

		// getting name of the file
		System.out.println(f.getName());

		// getting the entire path
		System.out.println(f.getPath());

		// File has overridden toString()
		// and returning result of getPath()
		// i.e. path
		System.out.println(f);

		System.out.println(f.length());

		System.out.println(f.exists());

		System.out.println(f.isFile());

		System.out.println(f.isDirectory());

		System.out.println(f.list());
	}

}
