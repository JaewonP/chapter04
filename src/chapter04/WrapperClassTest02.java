package chapter04;

public class WrapperClassTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 ="123456";
		int i = Integer.parseInt(s1);
		// cf 반대의 경우 
		String s2 = String.valueOf(i) ;
		System.out.println(s1 + ":" + s2);
		
		//문자를 숫자로 
		int a = Character.getNumericValue('A');
		System.out.println(a);
		
		//2진수 문자열
		String s = Integer.toBinaryString(15);
		System.out.println(s);
		
		//16진수 문자열
		String s5 = Integer.toHexString(15);
		System.out.println(s5);
	}

}
