package chap07.sec04.exam02;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
	
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeoff();
		sa.fly();
		sa.flymode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flymode = SupersonicAirplane.NORMAL;
		sa.fly();
		
		
	}

}
