package chap06.sec07.exam05;

public class Car {
	//필드 선언
	String company = "람보르기니";
	String modle;
	String color;
	int maxspreed;
	
	
	
	//생성자 생성
	Car(String model) {
		this(model, "은색", 250);
		System.out.println("생성자1");
		
	}
	
	Car(String modle, String color) {
		this(modle, color, 250);
		System.out.println("생성자2");
	}
	
	Car(String modle, String color, int maxspeed) {
		System.out.println("생성자3");
		this.modle = modle;
		this.color = color;
		this.maxspreed = maxspeed;
	}
}
