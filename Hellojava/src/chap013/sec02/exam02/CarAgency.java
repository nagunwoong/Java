package chap013.sec02.exam02;

// CarAgency 는 car를 렌트해주는 대리점 클래스
public class CarAgency implements Rentable<Car>{
	// 타입 파라미터 T 대신 Car 로 대체함
	@Override
	public Car rent() {// 리턴 타입이 반드사 Car 이어야 함
		return new Car();
		
	}
}
