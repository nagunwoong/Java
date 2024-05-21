package chap05.sec05;

public class LengthExample {

	public static void main(String[] args) {
		String ssn = "9410141******";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민등록번호 입니다.");
		}else {
			System.out.println("주민번호가 아님.");
		}
	}

}
