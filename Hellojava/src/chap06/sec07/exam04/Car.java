package chap06.sec07.exam04;

public class Car {
//필드 선언
	String company = "기아자동차";
	String modle;
	String color;
	int maxspeed;
	
	
	//생성자 선언
	Car(){
		System.out.println("1");
	}
	Car(String modle) {
		System.out.println("2");
		this.modle = modle;
	}
	Car(String modle, String color) {
		System.out.println("3");
		this.modle = modle;
		this.color = color;
	}
	Car(String modle, String color, int maxspeed) {
		System.out.println("4");
		this.modle = modle;
		this.color = color;
		this.maxspeed = maxspeed;
	}
	
}
