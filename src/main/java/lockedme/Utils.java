package lockedme;

import java.io.File;
import java.util.Scanner;

public class Utils {

	public static void enter_key(Scanner scan) {
		System.out.println("Press Enter to Continue");
		scan.nextLine();
	}

	public static void listFilesInDir() {

		String userDir = System.getProperty("user.dir")+"/testfiles";
		System.out.println("User Dir:-"+userDir);
		
		File f = new File(userDir);
		File[] files = f.listFiles();
		
		System.out.println("All the files in Current Dir");
		for (File file : files) {
			
			System.out.println(file.getName());
			
		}
		
		
	}

	public static void addFile(String fileName) {
		// TODO Auto-generated method stub
		
	}

	public static void deleteFile(String fileName) {
		// TODO Auto-generated method stub
		
	}

	public static void searchFile(String fileName) {
		// TODO Auto-generated method stub
		
	}

}
