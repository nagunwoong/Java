package chap06.sec09;

public class Car {
	//필드 선언
	String modle;
	int speed;
	
	
	
	//생성자 선언
	Car(String modle) {
		this.modle = modle; //매개 변수를 필드에 대입(this 생략 불가)
	}
	
	
	//메소드 선언
	void setspeed(int speed) {
		this.speed = speed; //매개 변수를 필드에 대입(this 생략 불가)
	}
	
	
	void run() {
		this.setspeed(100); //speed 필드의 값을 100으로 변경
		System.out.println(this.modle  + "가 달립니다.(시속은 " + this.speed + "KM 입니다.)");
	}
	
}
