package example8;

import java.io.FileInputStream;
import java.io.IOException;

// FileInputStream can read image, videos, texts, docs, etc.
// It reads the files in binary format
public class FileReadingUsingFileInputStream {

	public static void main(String[] args) throws IOException {

		FileInputStream in = new FileInputStream(
				"Z:\\Study\\java-interview-prep\\62 File Handling\\file-handling-files\\ab.txt");

		int x = 0;
		while ((x = in.read()) != -1) {
			System.out.print((char) x);
		}
		in.close();
	}

}
