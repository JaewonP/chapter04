package chapter04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class calendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance(); // Calendar는 추상 객체 이기 때문에 getInstance라는 static 메소드를 호출
		printDate(cal);
		
		cal.set(Calendar.YEAR, 2021);
		cal.set(Calendar.MONTH, 11); //month -1
		cal.set(Calendar.DATE, 31); //month -1
		printDate(cal);
		
		//2007년 11월 18일
		cal.set(1995, 12, 10);
		cal.add(Calendar.DATE, 10000);
		printDate(cal);
		
		// Date 객체로 변경
		Date d = new Date(cal.getTimeInMillis());
		printDate1(d);
	
	}

	public static void printDate1(Date d) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
	
		String dateString = sdf.format(d);
		System.out.println(dateString);
	}
	


	public static void printDate(Calendar cal) {
		String[] days = {"일", "월","화","수","목","금","토"};
		
		//년도
		int year = cal.get(Calendar.YEAR);
		
		//월
		int month = cal.get(Calendar.MONTH);
		
		//일
		int date = cal.get(Calendar.DATE);
		
		//요일[1(일요일) ~ 7(토요일)]
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		//AM, PM
		int am = cal.get(Calendar.AM_PM);
		
		//시
		int hour = cal.get(Calendar.HOUR);
		
		//분
		int minute = cal.get(Calendar.MINUTE);
		
		//초
		int second = cal.get(Calendar.SECOND);
		

				System.out.print(year + "년");
				System.out.print((month + 1) + "월");
				System.out.print(date + "일");
				System.out.print(days[day -1] + "요일");
				System.out.print(am == 0 ? "오전" : "오후");
				System.out.print(hour + "시");
				System.out.print(minute + "분");
				System.out.print(second + "초");
				System.out.println("");
				
						
				
		
	}
}
