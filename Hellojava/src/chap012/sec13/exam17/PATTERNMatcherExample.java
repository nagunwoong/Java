package chap012.sec13.exam17;

import java.util.regex.Pattern;

public class PATTERNMatcherExample {

	public static void main(String[] args) {
		
		String id = "5Angle11004";
		String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
		/* [a-zA-Z] : 첫글자는 영문자 1글자(대문자,소문자 상관없음)
		 * [a-zA-Z0-9] : 두번째 글자 글자(영어 대문자,영어 소문자, 숫자)
		 */
			
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("ID로 사용할수 습니다");
		}else {
			System.out.println("ID로 사용할수 없습니다");
		}
		
	}

}
