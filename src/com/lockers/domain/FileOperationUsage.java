package com.lockers.domain;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.ArrayList;
//the below added for the getFiles
import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;

public class FileOperationUsage implements FileOperations {

//public String myFile;

	@Override
	public void addMessage(String message) {
		System.out.println(message);

	}

	@Override
	public void addFile(String fileName) {

		// myFile = fileName;
		
		//set defualt directory
		//String currDir = System.getProperty("user.dir");				
		//addMessage("Directory path is  " + currDir);

		File myFile2 = new File(fileName);

		if (myFile2.exists()) {
			addMessage("File already exist " + fileName);
		} else {
			// creation of file started
			try {
				boolean b = myFile2.createNewFile();

				if (b == true) {
					addMessage("File added  " + fileName);
				}

			} catch (IOException e) {

				e.printStackTrace();
			}

		}

	}

	@Override
	public void deleteFile(String fileName) {

		//set defualt directory
		//String currDir = System.getProperty("user.dir");
		
		//addMessage("Directory path is  " + currDir);
		
		File myFile2 = new File(fileName);

		if (myFile2.exists()) {

			if (myFile2.delete()) {
				addMessage("File Deleted  and the file name " + fileName);
			}

		} else {
			addMessage("File not found " + fileName);
		}

	}

	@Override
	public void searchFile(String fileName) {

		String currDir = System.getProperty("user.dir") + "\\myDir" ;
		
		//folder strcuture hard coded 
		//File fileDir = new File("C:\\Users\\vallenki\\Documents\\March2022_PGFSD\\19-java-first-assesment\\myDir");
		
		//folder structure without hard code 
		File fileDir = new File(currDir);
		
		int filesCnt;
		int temp = 0;
		ArrayList<String> list = new ArrayList<String>();

		if (fileDir.exists()) {
			// addMessage(" directory exist ");
			// find the number of files present in the directory
			filesCnt = fileDir.list().length;

			// addMessage(" filesCnt " + filesCnt);

			if (filesCnt > 0) {
				File[] fileList = fileDir.listFiles();

				for (File f : fileList) {
					// storing the file names under list
					list.add(f.getName());
				}

				// if file names added to the list then
				// get the search pattern

				if (list.size() > 0) {
					// reading from array list based on search pattern
					for (String element : list) {

						// based on the input parameter search
						if (element.contains(fileName)) {
							addMessage(element);
							temp = temp + 1;
						}
					}

					if (temp == 0) {
						addMessage("No files found with the given criteria");
					}

				} else {
					addMessage(" No files present ");
				}

			} else {
				addMessage(" No fies exit with the given criteria");
			}

		} else {
			addMessage(" No directory exist ");
		}

	}

	@Override
	public void getFiles() {

		
		String currDir = System.getProperty("user.dir") + "\\myDir" ;
		//addMessage("Present working directory is   " + currDir );
		
		// initialization and location of the files
		//File fileDir = new File("C:\\Users\\vallenki\\Documents\\March2022_PGFSD\\19-java-first-assesment\\myDir");
		//with out hard code of the directory path
		File fileDir = new File(currDir);
		
		int filesCnt;
		// List files = new ArrayList();

		if (fileDir.exists()) {
			//addMessage(" directory exist ");
			// find the number of files present in the directory
			filesCnt = fileDir.list().length;

			addMessage("Total files present count is  " + filesCnt);

			if (filesCnt != 0) {

				// List listFile = Arrays.asList(fileDir.list());
				// initialization
				// File list[] = fileDir.listFiles();

				File[] fileList = fileDir.listFiles();

				//addMessage(" Extract list starts  ");
				/*
				 * addMessage("without sort list the files  "); for (File f:fileList) {
				 * addMessage(f.getName()); }
				 */
				//addMessage("with Sort  ");
				// sort the file names
				Arrays.sort(fileList);
				for (File f : fileList) {
					addMessage(f.getName());

					// f.getName().contains(null);
				}

			} else {
				addMessage(" No Files avaiable  ");
			}

		} else {
			addMessage(" directory does not exist ");
		}

	}

}
