package chap06.sec10.exam03;

public class Car {
	
	//인스턴스 필드 선언
	int speed;
	//인스턴스 메소드 선언
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	//정적 메소드 선언
	/*정적메소드와 정적 블록에서 인스턴스 맴버 사용시 객체를 먼저 생성하고
	찬조 변수(인스턴스 필드, 인스턴스 메소드)로 접근함*/
	static void simulate() {
		//객체 생성
		Car mycar = new Car();
		mycar.speed =200;
		mycar.run();
		}

	public static void main(String[] args) {
		//정적 메속드 호출
		simulate();
		
		//객체 생성
		Car mycar = new Car();
		//인스턴스 맴버 사용
		mycar.speed = 400;
		mycar.run();
	}
	
	
	}
	

