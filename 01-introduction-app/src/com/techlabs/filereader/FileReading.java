package com.techlabs.filereader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\stuti\\eclipse-workspace\\01-introduction-app\\src\\com\\techlabs\\filereader\\demo.txt");
			int ch;
			try {
				while((ch=fileInputStream.read())!=-1) {
					System.out.print((char)ch);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
