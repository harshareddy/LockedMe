package lockedme;

import java.util.Scanner;
import lockedme.Utils;

public class LockedMe {

	private static final String APPLICATION_NAME = "LockedMe.com";
	private static final String DEVELOPER_NAME = "Harsha Reddy";
	private static final String userDir = System.getProperty("user.dir") + "/testfiles";

	public static void main(String[] args) {

		printWelcomeScreen();
		Scanner scan = new Scanner(System.in);

		String input;

		do {
			printMainContext();
			System.out.print("\nEnter Option :");
			input = scan.nextLine();
			System.out.println();

			if (input.equals("1")) {

				Utils.listFiles(userDir);
				System.out.println();

			} else if (input.equals("2")) {

				String sub_context;
				do {

					printSubContext();
					System.out.print("\nEnter Option :");
					sub_context = scan.nextLine();

					if (sub_context.equals("1")) {

						System.out.print("Enter the fileName to be added :");
						String fileName = scan.nextLine();
						Utils.addFile(userDir, fileName);
					} else if (sub_context.equals("2")) {
						System.out.print("Enter the fileName to be deleted :");
						String fileName = scan.nextLine();
						Utils.deleteFile(userDir, fileName);
					} else if (sub_context.equals("3")) {
						System.out.print("Enter the fileName for search :");
						String fileName = scan.nextLine();
						Utils.searchFile(userDir, fileName);
					} else if (sub_context.equals("4")) {
						break;
					} else {

						System.out.println("\nInvalid Input\n");
					}

				} while (!sub_context.equals("4"));

			} else if (input.equals("3")) {

				//System.out.println("Thanks for Using Lockedme Application!!!Bye");
				break;
			} else {
				System.out.println("\nInvalid Input\n");
			}

		} while (!input.equals("3"));

		scan.close();

	}

	private static void printWelcomeScreen() {

		System.out.println("\n\n####################################################\n");
		System.out.println("\tWelcome to " + APPLICATION_NAME + " application");
		System.out.println("\tDeveloped By: " + DEVELOPER_NAME);
		System.out.println("\n####################################################\n");

	}

	private static void printSubContext() {
		System.out.println("-------------------------");
		System.out.println("|---ADD,DELETE,SEARCH----|");
		System.out.println("-------------------------");
		System.out.println("1 => Add File");
		System.out.println("2 => Delete File");
		System.out.println("3 => Search File");
		System.out.println("4 => Back to the MAIN MENU");

	}

	private static void printMainContext() {
		System.out.println("--------------------");
		System.out.println("||--MAIN MENU--||");
		System.out.println("--------------------");
		System.out.println("1 => List Current Directory ");
		System.out.println("2 => Add,Delete,Search files");
		System.out.println("3 => Close the application");

	}

}
