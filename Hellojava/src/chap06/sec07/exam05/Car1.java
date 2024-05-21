package chap06.sec07.exam05;

public class Car1 {
	String modle;
	String color;
	int maxspeed;
	
	
	Car1(String modle) {
		this(modle, "은색", 250); //생성자 첫줄에 위치해야 에러 안남
		//this.modle = modle;
		//this.color = "검정";
		//this.maxspeed = 250;
	}
	
	Car1(String modle, String color) {
		this(modle, color, 250); //생성자 첫줄에 위치해야 에러가 안남
		//this.modle = modle;
		//this.color = color;
		//this.maxspeed = 250;
}
	Car1(String modle, String color, int maxspeed) { //공통 초기화 코드
		this.modle = modle;
		this.color = color;
		this.maxspeed = maxspeed;
		
	}
	
}
