package com.htc.corejava.day6;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		
		File file = new File("test.txt");
		System.out.println(file.exists());
		
		
		File folder = new File("myfolder");
		System.out.println(folder.exists());
		
		folder.mkdir();
		File newfile = new File(folder, "test.txt");
		try {
			newfile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
