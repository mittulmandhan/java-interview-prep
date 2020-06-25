package example11;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(
				"Z:\\Study\\java-interview-prep\\62 File Handling\\file-handling-files\\abc.txt");

		pw.print("good");
		pw.flush();

		FileReader fr = new FileReader(
				"Z:\\Study\\java-interview-prep\\62 File Handling\\file-handling-files\\abc.txt");

		int x = 0;
		while ((x = fr.read()) != -1) {
			System.out.print((char) x);
		}

		fr.close();
		pw.close();
	}
}
