package chap012.sec08;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		//getInstance() : 컴퓨터에 설정된 시간대 기준으로 Calender 객체를 사
		Calendar now = Calendar.getInstance();
		/*get() 메소드의 매개값으로 Calendar 의 정의된 상수를 주면
		 * 그 상수가 의미하는 값을 리턴함
		 */
		int year = now.get(Calendar.YEAR); //년도를 리턴
		int month = now.get(Calendar.MONTH)+1; //월을 리턴 (월은 0월부터 시작하므로 +1 해줘야함)
		int day = now.get(Calendar.DAY_OF_MONTH); // 일을 리턴
		int week = now.get(Calendar.DAY_OF_WEEK); //요일 리턴
		String strWeek = null;
		switch(week) {
			case Calendar.MONDAY : strWeek = "월"; break;
			case Calendar.TUESDAY : strWeek = "화"; break;
			case Calendar.WEDNESDAY : strWeek = "수"; break;
			case Calendar.THURSDAY : strWeek = "목"; break;
			case Calendar.FRIDAY : strWeek = "금"; break;
			case Calendar.SATURDAY : strWeek = "토"; break;
			default : strWeek = "일";			
		}
		
		int ampm = now.get(Calendar.AM_PM); //오전/오후를 리턴
		String strAmPm = null;
		if(ampm == Calendar.AM) {
			strAmPm = "오전";
			
		}else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(day + "일");
		System.out.println(hour + "시");
		System.out.println(minute + "분");
		System.out.println(second + "초");
		
		
		
		
	}

}
