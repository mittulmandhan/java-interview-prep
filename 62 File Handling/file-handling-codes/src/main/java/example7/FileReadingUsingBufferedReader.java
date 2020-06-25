package example7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingUsingBufferedReader {

	public static void main(String[] args) throws IOException {

		File file = new File("Z:\\Study\\java-interview-prep\\62 File Handling\\file-handling-files\\ab.txt");

		file.createNewFile();

		FileReader reader = new FileReader(file);
		BufferedReader bReader = new BufferedReader(reader);

		int x = 0;
		while ((x = bReader.read()) != -1) {
			System.out.print((char) x);
		}
		// BufferedReader object must be closed
		// first before closing FileReader object
		// because there might be multiple
		// BufferedReader objects consuming a FileReader object
		// so all of them must be closed before closing FileReader object
		bReader.close();
		reader.close();
	}

}
