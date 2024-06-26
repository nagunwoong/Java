package chap08.sec04;

public class RemoteControlExample {

	public static void main(String[] args) {
		//인터페이스 변수 선언
		RemoteControl rc;
		
		//Television  객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		rc.turnOff();
		
		System.out.println();
		
		
		//Audio 객체를 생성하고 터페이스 변수에 대입
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		rc.turnOff();
	}

}
