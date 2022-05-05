package com.lockers.client;

import java.util.Scanner;

import com.lockers.domain.FileOperationUsage;
import com.lockers.domain.FileOptions;

public class ApplicationList3 {

	public static void main(String[] args) {

		System.out.println("Welcome to application Company Lockers LockedMe File operations ");
		System.out.println("***************************************************************");
		System.out.println("     Developers        ");
		System.out.println("-----------------------");
		System.out.println("      Veeresh");
		

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("File feaures are below");
			System.out.println("1.Show files");
			System.out.println("2.File Operations");
			System.out.println("3.Exit");
			System.out.println("Enter your choice 1/2/3");

			// reading data from user
			int n = sc.nextInt();

			// System.out.println("Selected option " + (n));

			// the below block only accepts user input and validate
			if (n == 1) {
				System.out.println("extract files and show in Ascending order");

				// declare the object
				FileOperationUsage fileList = new FileOperationUsage();
				fileList.getFiles();

				//break; -- until user selects 3 it should not exit that means infinite
			} else if (n == 2) {
				System.out.println("File Operations ");

				// initialize the variable with null
				String fileName = null;
				// declare the object
				FileOperationUsage inputFile = new FileOperationUsage();

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

						fileName = sc.next() ;
						System.out.println("user provided file name is " + fileName);
						System.out.println("Adding the file");
						// invoke the method
						inputFile.addFile(fileName);

						//break; it should be in child menu 
					} else if (m == 12) {

						System.out.println("Enter the file to be deleted ");
						// reading data from user for file operation
						fileName = sc.next();
						System.out.println("user provided file name is " + fileName);
						// invoke the method to delete the file
						inputFile.deleteFile(fileName);

						//break; //it should be in child menu
					} else if (m == 13) {
						System.out.println("Enter the file to be searched ");
						// reading data from user for file operation
						fileName = sc.next();
						// System.out.println("user provided file name is " + fileName);
						// System.out.println("Search file based on the user input file ");
						inputFile.searchFile(fileName);
						//break; // it should be in child menu
					} else if (m == 14) {
						System.out.println("Go to Main Menu");
						// getMainMenu(14);
						break;
					} else {
						System.out.println("Wrong sub menu opted please try again");
						// break;
					}

				} // end of while

				// break;

			} else if (n == 3) {
				System.out.println("Close the application");
				break; // terminates the loop
			} else {
				System.out.println("Wrong choice opted please try again");
				// break;
			}

		} // end of while loop

	}

}
