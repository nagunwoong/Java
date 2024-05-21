package chap05.sec05;

public class CharAltExample {

	public static void main(String[] args) {
		String ssn = "941014-2******"; //앞자리 0부터 시작
		char s = ssn.charAt(7);
		switch (s) {
		case '1' :
		case '3' :
			System.out.println("남자입니다.");
		break;
		
		case '2' :
		case '4' :
			System.out.println("여자입니다.");
		}
		
		
		
	}

}
