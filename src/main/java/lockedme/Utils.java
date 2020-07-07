package lockedme;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
//import java.util.Scanner;

public class Utils {

	/*
	 * public static void enter_key(Scanner scan) {
	 * System.out.println("Press Enter to Continue"); scan.nextLine(); }
	 */

	public static void listFiles(String userDir) {

		File f = new File(userDir);
		File[] files = f.listFiles();

		Arrays.sort(files, new FileNameComparator());

		for (File file : files) {

			if (file.isDirectory()) {
				listFiles(file.getAbsolutePath());
			} else {
				System.out.println(file);
			}

		}

	}

	public static void addFile(String userDir, String fileName) {
		File f = new File(userDir + "/" + fileName);
		f.getParentFile().mkdirs();
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void deleteFile(String userDir, String fileName) {
		File f = new File(userDir + "/" + fileName);
		if (f.exists()) {
			f.delete();
		} else {
			System.out.println("File not found ");
		}

	}

	public static void searchFile(String userDir, String fileName) {

		File f = new File(userDir);

		File[] files = f.listFiles();
		boolean fileExists = false;

		for (File file : files) {

			if (file.getName().toString().equals(fileName)) {
				System.out.println(file.getName() + " Found " + file.getAbsolutePath());
				fileExists = true;
				break;
			}
		}

		if (!fileExists) {
			System.out.println(fileName + " does not exist");
		}

	}

}
