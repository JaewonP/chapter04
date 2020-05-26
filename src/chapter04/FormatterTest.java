package chapter04;

public class FormatterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		StringBuffer sb  =  new StringBuffer();
		
		String name = "안대혁";
		int  score = 9;
		

		String s = String.format("%s님의 점수는 %d 입니다.", name, score );
		// %f: 실수, %d: 정수, %s: 문자열, %c: 문자...
		System.out.println(s);

	}

}
