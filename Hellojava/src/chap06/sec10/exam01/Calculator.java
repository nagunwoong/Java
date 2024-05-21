package chap06.sec10.exam01;

public class Calculator {
	//정적 필드 , 정적 메소드 (메소드 영역의 클래스에 고정적으로 위치하는 맴버
	//클래스가 메모리로 로딩돠면 정적 멤버로 사용할수 있음.
	//정적 필드 선언
	static double pi = 3.14159;
	//정적 메소드 선언
	
	static int plus(int x, int y) {
		return x + y;
	}
	static int minus(int x, int y) {
		return x - y;
	}
	
	
}
