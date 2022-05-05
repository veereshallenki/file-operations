package com.lockers.domain;

public interface FileOperations {

	// add debug message
	public void addMessage(String message);
	
	// to add the file method
	public void addFile(String fileName);

	// to delete the file method
	public void deleteFile(String fileName);

	// to search file
	public void searchFile(String fileName); 
	
	//extract files with Ascending order	
	public void getFiles();
	

}
