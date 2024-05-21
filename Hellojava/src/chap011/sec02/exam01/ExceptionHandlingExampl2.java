package chap011.sec02.exam01;

public class ExceptionHandlingExampl2 {
	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자수 : " + result);
		
		}catch(NullPointerException e) {
			System.out.println(e.getMessage()); // 예외가 발생한 이유만 리턴
			//System.out.println(e.getMessage()); // 예외의 종류도 같이 리턴
			//e.printStackTrace(); //예외가 어디서 발생했는지 추적한 내용까지 리턴
		} finally {
			System.out.println("마무리 실행/n");
		}
	}

	public static void main(String[] args) {
		
		
		System.out.println("[프로그램 시작]\n");
		printLength("This is Java");
		printLength(null); // 매개값으로 null을 대입함
		System.out.println("[프로그램 종료]");
	}

}
