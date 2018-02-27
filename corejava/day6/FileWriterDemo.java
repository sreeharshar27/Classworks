package com.htc.corejava.day6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		
		File file = new File("myfolder", "sample.txt");
		FileWriter fw = null;
		try {
			 fw = new FileWriter(file);
			fw.write("This is a line");
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("File created");
	}
}
