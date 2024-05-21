package chap06.sec08.exam03;

public class CarExample {

	public static void main(String[] args) {
		//car 객체 생성
		Car mycar = new Car();
		
		//리턴값이 없는 setgas() 호출
		mycar.setgas(5);
		
		if(mycar.islefgas()) {
			System.out.println("자동차가 출발합니다.");
			//리턴값이 없는 run() 메소드 호출
			mycar.run();
		}
		
		System.out.println("gas를 주입하세요");
		
	}

}
