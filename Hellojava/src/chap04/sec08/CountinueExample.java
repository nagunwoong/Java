package chap04.sec08;

public class CountinueExample {

	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			if(i%2 != 0) {
				continue;
				
			}
			System.out.println(i + "");
		}
		System.out.println();
		System.out.println("for를 벗어난 다음 문장 실행중");
	}

}
