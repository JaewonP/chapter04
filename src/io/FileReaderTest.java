package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader in = null;
		InputStream is = null;
		
		try {
			in = new FileReader("1234.txt");
			
			
			
			int count = 0;
			int data = -1;
			while((data = in.read()) != -1) {
				count++;
				System.out.print((char)data);
			}
			System.out.println("\n");
			System.out.println("count :" + count);
			System.out.println("+++++++++++++++++++++++++++++++++++++");
			
			is = new FileInputStream("1234.txt");
			

			count = 0;
		    data = -1;
		    
		    
			while((data = is.read()) != -1) {
				count++;
				System.out.print((char)data);
			}
			System.out.println("\n");
			System.out.println("count :" + count);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if( in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
		
		}
		

	}

}
