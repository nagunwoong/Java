package chap011.sec03.exam02;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		String[] array = {"100", "1oo"};
		
		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "] : " + value);
			} catch(ArrayIndexOutOfBoundsException e) {
				//배열의 인덱스가 초과되었을 경우 발생하는 예외처리문
				System.out.println("배열의 인덱스가 초과됨" + e.getMessage());
			} catch(Exception e) { // 상위 예와ㅣ 클래스
				//숫자 타입이 아날때 발생하는 에외 처리
				System.out.println("실행에 문제가 있습니다");
			}
		}
	}
}
