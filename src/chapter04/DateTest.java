package chapter04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		System.out.println(now);

		printDate1(now);
	}
	
	public static void printDate1(Date d) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
	
		String dateString = sdf.format(d);
		System.out.println(dateString);
	}
	
	public static void printDate2(Date d1) {
		//calendar가 안정적이니까 쓸 것 이것 말고
		
		// 년도(+1900)
		int year = d1.getYear();
		
		System.out.println((year + 1900) + "년");
		
		//int 월(0~11, +1)
		int month = d1.getMonth();
		
		System.out.println((month + 1) + "월");
		
		//일
		int date = d1.getDate();
		
		System.out.println(date + "일");
		
		//시간
		int hour = d1.getHours();
		System.out.println(date + "시");
		
		//분 
		int minute = d1.getMinutes();
		System.out.println(minute + "분");
		
		//초
		int second = d1.getSeconds();
		System.out.println(second + "초");
		
	}

}
