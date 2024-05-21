package chap07.sec05.exam02;

public class Car {
	//핑드 선언
	public int speed;
	
	//메소드 선언
	public void speedUp() {
		speed += 1;
	}
	
	//final 메소드 선언
	private void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
		
	}
	
}
