package example1;

import java.io.File;

public class CreatingFileObject {

	public static void main(String[] args) {
		// we need to make an object of type File
		// and pass the path of the existing or required file
		// this statement will not create a file
		// but will only create an object of type File in Heap
		File f = new File("Z:\\Study\\java-interview-prep\\62 File Handling\\file-handling-files\\a.txt");
	}

}
