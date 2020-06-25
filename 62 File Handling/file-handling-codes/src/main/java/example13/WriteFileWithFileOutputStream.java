package example13;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

public class WriteFileWithFileOutputStream {

	public static void main(String[] args) throws Exception {
		File file = new File("Z:\\Study\\java-interview-prep\\62 File Handling\\file-handling-files\\example13.txt");
		FileOutputStream fo = new FileOutputStream(file);

		byte b[] = new byte[] { 65, 66, 67, 68 };

		fo.write(b);
		fo.flush();

		FileReader fr = new FileReader(file);

		int x = 0;

		while ((x = fr.read()) != -1) {
			System.out.print((char) x);
		}
		fr.close();
		fo.close();

	}

}
