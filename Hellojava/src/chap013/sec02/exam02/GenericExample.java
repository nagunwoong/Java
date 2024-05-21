package chap013.sec02.exam02;

public class GenericExample {

	public static void main(String[] args) {
		
		HomeAgency homeagency = new HomeAgency();
		Home home =	homeagency.rent();
		home.turnOnLight();
		
		CarAgency caragency = new CarAgency();
		Car car = caragency.rent();
		car.run();
		
	}

}
