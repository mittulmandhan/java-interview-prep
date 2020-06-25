package example6;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// FileReader can only be used to read a text file
public class FileReadingUsingFileReader {

	public static void main(String[] args) throws IOException {

		File file = new File("Z:\\Study\\java-interview-prep\\62 File Handling\\file-handling-files\\ab.txt");

		file.createNewFile();

		FileReader reader = new FileReader(file);

		int x = 0;

		while ((x = reader.read()) != -1) {
			System.out.print((char) x);
		}
		reader.close();
	}

}
