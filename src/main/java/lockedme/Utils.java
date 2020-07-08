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

		// System.out.println("File Exists="+f.exists());

		if (!f.exists()) {
			f.mkdir();
			System.out.println("Created root Directory:" + userDir);
		}

		File[] files = f.listFiles();

		if (files.length > 1) {
			Arrays.sort(files, new FileNameComparator());
		}

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

		if (f.exists()) {
			System.out.println("\n" + fileName + " already exists\n");
			return;
		}

		f.getParentFile().mkdirs();

		try {
			f.createNewFile();
		} catch (IOException e) {
			System.out.println("\nError while creating a new file \n");
			e.printStackTrace();
		}

	}

	public static void deleteFile(String userDir, String fileName) {
		File f = new File(userDir + "/" + fileName);
		if (f.exists()) {
			f.delete();
		} else {
			System.out.println("\n" + fileName + " File not found\n ");
		}

	}

	public static void searchFile(String userDir, String fileName) {

		File f = new File(userDir);

		File[] files = f.listFiles();
		boolean fileExists = false;

		for (File file : files) {

			if (file.getName().toString().equals(fileName)) {
				System.out.println("\n" + file.getAbsolutePath() + "\n");
				fileExists = true;
				break;
			}
		}

		if (!fileExists) {
			System.out.println("\n" + fileName + " does not exist\n");
		}

	}

}
