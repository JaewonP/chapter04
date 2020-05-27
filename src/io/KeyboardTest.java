package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		

		try {
			// 기반 스트림(표준입력, stdin, System.in)
			
			// 보조 스트림1 (byte|byte|byte -> char)	
			InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
			
			// 보조 스트림 2 (char|char|char|\n -> string)
			br = new BufferedReader(isr);
			String line = null;
			
			   while((line = br.readLine()) != null) {
				  
				   if("exit".equals(line)) {
					   break;
				   }
					System.out.println(line);
				}
			}catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		

	}

}
