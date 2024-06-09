package ch01.sec01.exam01;

public class MethodDemo1 {
	// 메소드 정의
	public static void numbering() {
		
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		
	}
	// 메소드 호출
	public static void main(String[] args) {
		numbering();
		}
	// 메소드 numbering 을 호출했으므로 numbering 부분 메소드가 실행됨 

}
