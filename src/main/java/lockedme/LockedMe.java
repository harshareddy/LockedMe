package lockedme;

import java.util.Scanner;

public class LockedMe {

	public static final String APPLICATION_NAME = "LockedMe.com";
	public static final String DEVELOPER_NAME = "Harsha Reddy";

	public static void main(String[] args) {

		System.out.println("####################################################");
		System.out.println();
		System.out.println("\tWelcome to " + APPLICATION_NAME + " application");
		System.out.println("\tDeveloped By: " + DEVELOPER_NAME);
		System.out.println();
		System.out.println("####################################################");

		Scanner scan = new Scanner(System.in);
		Utils.enter_key(scan);
		String input;

		do {
			System.out.println("1 => List Current files ");
			System.out.println("2 => Add,Delete,Search files");
			System.out.println("3 => Exit the application");
			input = scan.nextLine();

			if (input.equals("1")) {

				System.out.println("Picked option 1 List Current files");
				Utils.listFilesInDir();
				System.out.println();
				Utils.enter_key(scan);

			} else if (input.equals("2")) {

				System.out.println("Picked option 2 Add, Delete, Search files");
				System.out.println();
				String sub_context;
				do {
					System.out.println("\t1 => Add File");
					System.out.println("\t2 => Delete File");
					System.out.println("\t3 => Search File");
					System.out.println("\t4 => Back to the main context");
					sub_context = scan.nextLine();

					if (sub_context.equals("1")) {

						System.out.println("\tEnter the fileName to be added");
						String fileName = scan.nextLine();
						Utils.addFile(fileName);
					} else if (sub_context.equals("2")) {
						System.out.println("\tEnter the fileName to be deleted");
						String fileName = scan.nextLine();
						Utils.deleteFile(fileName);
					} else if (sub_context.equals("3")) {
						System.out.println("\tEnter the fileName for search ");
						String fileName = scan.nextLine();
						Utils.searchFile(fileName);
					} else if (sub_context.equals("4")) {
						System.out.println("Going back to main context");
						break;
					}

					Utils.enter_key(scan);

				} while (!sub_context.equals("4"));

				Utils.enter_key(scan);
			} else if (input.equals("3")) {

				System.out.println("Thanks for Using Lockedme Application!!!Bye");
				return;
			}

		} while (!input.equals("3"));

	}

}
