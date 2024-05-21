package chap06.sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		//Korean 객체 생성시 주민번호와 이름을 전달함
		Korean k1 = new Korean("123456-123345", "감자바");
		//필드값 읽기
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		//필드값 변경
		//k1.nation = "USA"; //final 필드는 값을 변경할수 없음
		//k1.ssn = "1234-234123";  //final 필드는 값을 변경할수 없음
		k1.name = "사람"; //final 필드가 안들어간 값은 변경 가능함
		
		
		
	}

}
