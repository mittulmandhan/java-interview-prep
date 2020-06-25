package example10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteUsingFileWriter {
	public static void main(String[] args) throws IOException {
		File file = new File("Z:\\Study\\java-interview-prep\\62 File Handling\\file-handling-files\\abc.txt");
		file.createNewFile();

		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("abc");
		bw.newLine();
		bw.write("def");
		bw.flush();

		FileReader fr = new FileReader(file);

		int x = 0;

		while ((x = fr.read()) != -1) {
			System.out.print((char) x);
		}
		fr.close();
		bw.close();
		fw.close();

	}
}
