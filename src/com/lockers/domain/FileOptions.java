package com.lockers.domain;

import java.util.Scanner;

public class FileOptions {

	public int result = 0;

	public void getFileOptions() {

		// this is for to select the sub menu
		Scanner sc = new Scanner(System.in);

		// this is to enter the file name
		Scanner sc1 = new Scanner(System.in);

		// initialize the variable with null
		String fileName = null;

		// declare the object
		FileOperationUsage inputFile = new FileOperationUsage();

		// validating the sub menu based on user input
		while (true) {

			System.out.println("11.Add File");
			System.out.println("12.Delete File");
			System.out.println("13.Search File");
			System.out.println("14.Go to Main Menu");
			System.out.println("Enter your choice 11/12/13/14");

			// reading data from user for file operation
			int m = sc.nextInt();

			// System.out.println("Selected option from sub menu " + (m));

			if (m == 11) {
				System.out.println("Enter the file to be Added ");

				fileName = sc1.nextLine();
				System.out.println("user provided file name is " + fileName);
				System.out.println("Adding the file");
				// invoke the method
				inputFile.addFile(fileName);

				break;
			} else if (m == 12) {

				System.out.println("Enter the file to be deleted ");
				// reading data from user for file operation
				fileName = sc1.nextLine();
				System.out.println("user provided file name is " + fileName);
				// invoke the method to delete the file
				inputFile.deleteFile(fileName);

				break;
			} else if (m == 13) {
				System.out.println("Enter the file to be searched ");
				// reading data from user for file operation
				fileName = sc1.next();
				// System.out.println("user provided file name is " + fileName);
				// System.out.println("Search file based on the user input file ");
				inputFile.searchFile(fileName);
				break;
			} else if (m == 14) {
				System.out.println("Go to Main Menu");
				// getMainMenu(14);
				break;
			} else {
				System.out.println("Wrong sub menu opted please try again");
				// break;
			}

		} // end of while

	}

}
