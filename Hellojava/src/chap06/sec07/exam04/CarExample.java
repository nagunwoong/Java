package chap06.sec07.exam04;

public class CarExample { //메인클래스

	public static void main(String[] args) {
	
		Car car1 = new Car();
		System.out.println("Car1.company : " + car1.company);
		System.out.println();
		
		
		Car car2 = new Car("자가용");
		System.out.println("Car2.company : " + car2.company);
		System.out.println("Car2.modle : " + car2.modle);
		System.out.println();
		
		Car car3 = new Car("자가용", "노랑");
		System.out.println("Car3.company : " + car3.company);
		System.out.println("Car3.modle : " + car3.modle);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car car4 = new Car("자가용", "노랑", 300);
		System.out.println("Car4.company : " + car4.company);
		System.out.println("Car4.modle : " + car4.modle);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.color : " + car4.maxspeed);
	}

}
