package example5;

import java.io.File;

public class NumberOfFiles {

	public static void main(String[] args) {

		File f = new File("Z:\\Study\\java-interview-prep\\62 File Handling\\file-handling-files");

		File[] list = f.listFiles();

		int countFile = 0;

		for (File m : list) {
			if (m.isFile()) {
				System.out.println("file name: " + m.getName());
				countFile++;
			} else {
				System.out.println("folder name: " + m.getName());
			}
		}

		System.out.println("There are " + countFile + " files");

		System.out.println("And " + (list.length - countFile) + " folders");
	}

}
