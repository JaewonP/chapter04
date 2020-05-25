package chapter04;

public class StringTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//c:\temp
		
		String s = "c:\temp";
		System.out.println(s);
		// \r -> carriage return 제어문자
		// \t -> tap 제어문자
		// \n -> \r + \t (new line 제어문자)

		System.out.println("Hello\tworld\r\n");
		System.out.println("Hello\tworld\n");
		
		
		String s1 = "c:\\temp";
		System.out.println(s1);
		// \\두개로 해야 escape 
		
		//"Hello"
		String s2 = "\"Hello\"";
		System.out.println(s2);
		
		//'
		char c = '\'';
		System.out.println(c);		
	}

}
