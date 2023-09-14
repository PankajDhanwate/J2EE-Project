package com.jspiders.filehandling.operation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWrite {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("Demo.txt");
		
		if (file.exists()) {
			FileOutputStream  fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(20);
			System.out.println("Data Written to the File...");
			fileOutputStream.close();
		}
		else {
			file.createNewFile();
			System.out.println("File is Created...");
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(20);
			System.out.println("Data Written to the File...");
			fileOutputStream.close();
		}
	}

}
