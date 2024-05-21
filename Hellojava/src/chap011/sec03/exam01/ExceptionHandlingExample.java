package chap011.sec03.exam01;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		String[] array = {"100", "1oo"}; // 배열인덱스는 0번부터 부여
		
		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "] : " + value);
			} catch(ArrayIndexOutOfBoundsException e) {
				//배열의 인덱스가 초과되었을 경우 발생하는 예외처리문
				System.out.println("배열의 인덱스가 초과됨" + e.getMessage());
			} catch(NumberFormatException e) {
				//숫자 타입이 아날때 발생하는 에외 처리
				System.out.println("숫자로 변환할수 없음" + e.getMessage());
			}
		}
	}

}
