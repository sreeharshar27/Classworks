package com.htc.corejava.day6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) {
		File file = new File("myfolder", "formatted");
		BufferedReader br= null;
		try {
			br  = new BufferedReader(new FileReader(file));
			
			while(true) {
				String line = br.readLine();
				if(line == null)
					break;
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				if(br!=null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
