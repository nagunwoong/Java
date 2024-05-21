package chap06.sec07.exam05;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car("법인용"); //생성 1 호
		System.out.println("car1.caompany = " + car1.company);
		System.out.println("car1.modle = " + car1.modle);
		System.out.println("car1.color = " + car1.color);
		System.out.println("car1.maxspeed = " + car1.maxspreed);
		System.out.println();
		
		Car car2 = new Car("화물용", "빨강"); //생성자 2를 호출
		System.out.println("car2.caompany = " + car2.company);
		System.out.println("car2.modle = " + car2.modle);
		System.out.println("car2.color = " + car2.color);
		System.out.println("car2.maxspeed = " + car2.maxspreed);
		System.out.println();
		
		Car car3 = new Car("택시", "검정", 300);
		System.out.println("car3.company = " + car3.company);
		System.out.println("car3.modle = " + car3.modle);
		System.out.println("car3.color = " + car3.color);
		System.out.println("car3.maxspeed = " + car3.maxspreed);
	}

}
