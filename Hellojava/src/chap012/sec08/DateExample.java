package chap012.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	 public static void main(String[] args) {
		 // Date 클래스 : 날짜 표현 클래스로 객체간에 날짜 정보를 주고받을때 사용
		 // Date()생성자 : 현재 날짜를 읽어서 Date 객체로 만듬
		 Date now = new Date();
		 String strNow1 = now.toString();
		 System.out.println(strNow1);
		 
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss");
		 String strNow2 = sdf.format(now);
		 /*SimpleDateFormat은 날짜를 형식화된 문자열로 변화하는 기능을 제공
		  * format 메소드로 날짜를 제공하면 패턴과 동일한 문자열을 얻을수 있음
		  */
		 System.out.println(strNow2);
	 }
}
