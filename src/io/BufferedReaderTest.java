package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		
		try {
			// 기반 스트림 
			FileReader fr = new FileReader("./src/io/BufferedReaderTest.java");
			
			// 보조 스트림
			br = new BufferedReader(fr);
			
			int index = 0;
			String line = null;
			
		   while((line = br.readLine()) != null) {
			   index ++;
			   System.out.print(index);
			   System.out.print(":");
			   System.out.print(line);
			   System.out.print("\n");
					
				}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		 finally 
		 {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		
}

	}


