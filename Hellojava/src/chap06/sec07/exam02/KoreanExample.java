package chap06.sec07.exam02;

public class KoreanExample { //샐행 클래

	public static void main(String[] args) {
		//korea 객체 생성
		Korean Ko = new Korean("윤하", "941014-1");
		//korea 객체 데이터 읽기
		System.out.println("Ko.name = " + Ko.name);
		System.out.println("Ko.nation = " + Ko.nation);
		System.out.println("KO.ssn = " + Ko.ssn);
		
		Korean Ko1 = new Korean("나건웅", "01047543187");
		
		System.out.println("Ko1. name = " + Ko1.name);
		System.out.println("Ko.1 전화번호는 = " + Ko1.ssn);
		
		
		
		
		
	}

}
