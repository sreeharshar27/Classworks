package com.htc.corejava.day6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		File file = new File("myfolder", "formatted");
		PrintWriter pw = null;
		try {
			
			pw = new PrintWriter(new FileWriter(file));
			pw.println("This is the first line");
			pw.println("This is the second line");
			pw.println("This is the thrid line");
			pw.println("This is the last line");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			pw.close();
		}
		System.out.println("File created.");
	}
}
