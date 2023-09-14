package com.jspiders.filehandling.operation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamWrite {

	public static void main(String[] args) throws IOException {
		
		File file = new File("Demo.txt");
		
		if (file.exists()) {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Data from the java Program...");
			System.out.println("Data Written to the file...");
			fileWriter.close();
		}
		else {
			file.createNewFile();
			System.out.println("File is Created...");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Data From the java Program...");
			System.out.println("Data writen to the file...");
			fileWriter.close();
		}
	}
}
