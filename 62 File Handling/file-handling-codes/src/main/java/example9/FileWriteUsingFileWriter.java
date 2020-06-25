package example9;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteUsingFileWriter {
	public static void main(String[] args) throws IOException {
		File file = new File("Z:\\Study\\java-interview-prep\\62 File Handling\\file-handling-files\\abc.txt");
		file.createNewFile();

		FileWriter fw = new FileWriter(file);

		fw.write("abc");
		// flush() method is essential to transfer your changes
		// from buffer to the file
		// write method calls flush() only when buffer gets full
		// where buffer size is 8kb
		fw.flush();

		FileReader fr = new FileReader(file);

		int x = 0;

		while ((x = fr.read()) != -1) {
			System.out.print((char) x);
		}
		fr.close();
		fw.close();

	}
}
