package example2;

import java.io.File;
import java.io.IOException;

public class CreatingFile {

	public static void main(String[] args) {
		File f = new File("Z:\\Study\\java-interview-prep\\62 File Handling\\file-handling-files\\a.txt");

		try {
			// createNewFile is used create a new file
			// at the given location
			// createNewFile() throws IOException
			// so we have to surround it with try catch
			boolean created = f.createNewFile();

			// if object is created print "file created" else print "file not created"
			// if file already exist then it will print file not created
			if (created) {
				System.out.println("file created");
			} else {
				System.out.println("file not created");
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
