package chap012.sec08;

import java.util.Calendar;
import java.util.TimeZone;

public class LosAngelesExample {

	public static void main(String[] args) {
		/* Calendar 클래스의 오버로딩된 다른 getInStanse 매소드를 이용해서
		 * 미국의 로스앤젤레스와 같은 다른 시간대의 Calendar 를 얻음
		 * ==> 알고 싶은 시간대의 TimeZone 객체를 얻어
		 * getInStanse() 메소드의 매개값으로 넘겨주면 됨
		 * 
		 */
		TimeZone timezone = TimeZone.getTimeZone("America/LosAngeles");
		Calendar now = Calendar.getInstance(timezone);
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
			
		}else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		

		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초 ");
		
		
	}

}
