package example3;

import java.io.File;

public class CreatingFolder {

	public static void main(String[] args) {
		File f = new File("Z:\\Study\\java-interview-prep\\62 File Handling\\file-handling-files\\ab");

		// mkdir is used create a new folder
		// at the given location
		boolean created = f.mkdir();

		// if object is created print "folder created" else print "folder not created"
		// if file already exist then it will print folder not created
		if (created) {
			System.out.println("folder created");
		} else {
			System.out.println("folder not created");
		}
	}

}
