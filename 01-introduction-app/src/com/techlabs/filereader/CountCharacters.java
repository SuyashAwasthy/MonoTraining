package com.techlabs.filereader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CountCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\stuti\\eclipse-workspace\\01-introduction-app\\src\\com\\techlabs\\filereader\\demo.txt");
			int ch;
			int charCount=0;
			int spaces=0;
			int lines=0;
			try {
				while((ch=fileInputStream.read())!=-1) {
					System.out.print((char)ch);
					charCount++;
					if((char)ch==' ') {
						charCount--;
						spaces++;
					}
					if((char)(ch)=='\n') {
						lines++;
					}
				}
				System.out.println();
				System.out.println("\nCharacters = "+charCount);
				System.out.println("Words = "+(spaces+1));
				System.out.println("Lines = "+(lines+1));
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
