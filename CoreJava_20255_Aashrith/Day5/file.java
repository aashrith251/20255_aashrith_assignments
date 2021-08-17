package com.sonata.fileread;

import java.io.FileInputStream;

public class file extends Thread {
	public synchronized static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("C:/testout.txt");
			Thread.sleep(500);
		}
		catch(Exception e) {
			System.out.println("File not Found");
		}
		finally {
			System.out.println("Executed the program");
		}

	}

}
