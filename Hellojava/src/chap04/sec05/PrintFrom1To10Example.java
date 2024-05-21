package chap04.sec05;

public class PrintFrom1To10Example {

	public static void main(String[] args) {
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("While 다음 문장을 실행중 : " +i);
	}

}
