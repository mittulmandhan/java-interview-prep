package example14;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyPasteExample {

	public static void main(String[] args) throws IOException {
		File copyFile = new File("Z:\\Study\\java-interview-prep\\62 File Handling\\file-handling-files\\copy.txt");
		File pasteFile = new File("Z:\\Study\\java-interview-prep\\62 File Handling\\file-handling-files\\paste.txt");

		FileWriter copyWriter = new FileWriter(copyFile);
		copyWriter.write("abcd");
		copyWriter.flush();

		FileReader copyReader = new FileReader(copyFile);
		FileWriter pasteWriter = new FileWriter(pasteFile);

		int x = 0;
		while ((x = copyReader.read()) != -1) {
			pasteWriter.write((char) x);
		}
		pasteWriter.flush();

		FileReader pasteReader = new FileReader(pasteFile);

		while ((x = pasteReader.read()) != -1) {
			System.out.print((char) x);
		}
		copyReader.close();
		copyWriter.close();
		pasteReader.close();
		pasteWriter.close();

	}

}
