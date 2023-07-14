package com.FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileReaderWriter {

	public static void main(String[] args) {
		
//		try 
//		{
//			File f = new File("C:\\Users\\hp\\Programs\\QBS_Core_java\\JAVA.txt");
//			FileReader fr = new FileReader(f);
//			char a[] = new char[5] ;
//			fr.read(a);
//			for(char e: a)
//			{
//				System.out.println(a);
//			}
//			fr.close();

//			File f = new File("C:\\Users\\hp\\Programs\\QBS_Core_java\\JAVA1 .txt");
//			FileWriter fr = new FileWriter(f);
//			char c[] = {'s', 'a', 't'};
//			fr.write(c);
//			fr.close();
//			System.out.println("Writing successfull");	
//		}
		
//		catch(Exception e)
//		{
//			e.getStackTrace();
//		}
//
		
		
		
		
		
//		Code for creating file
		try {
			File f = new File("C:\\Users\\hp\\Programs\\QBS_Core_java\\Sample.txt");
			
			if(!f.exists())
			{
				f.createNewFile();
			}
			
//			Writing the text into above created file
			FileOutputStream fos = new FileOutputStream(f);
			String textToBeWritten = "My name is Siddhant";
			fos.write(textToBeWritten.getBytes());        //fos.write doesn't take string, so we convert in into byte using getBytes()
			fos.close();
			
//			Reading the text from the file
			FileInputStream fis = new FileInputStream(f);
			
			int i = fis.read();
			while(!(i==-1))
			{
				char c = (char)i;    // fis.read() return an asci value of characters, so we convert in into char using (char)i
				System.out.print(c);
				i = fis.read();
			}
			
			fis.close();
			
			
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}
		
		

}
