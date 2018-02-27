package com.htc.corejava.day6;

import java.io.IOException;
import java.util.Scanner;

public class KeyboardInput {

	public static void main(String[] args) {
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner br = new Scanner(System.in);
		System.out.print("Enter name:");
		//String name = br.readLine();
		String name = br.nextLine();
		System.out.print("Enter num:");
		//int num = Integer.parseInt(br.readLine());
		int num = Integer.parseInt(br.nextLine());
		System.out.println(name + "," + num);
		br.close();
		
	}
}
