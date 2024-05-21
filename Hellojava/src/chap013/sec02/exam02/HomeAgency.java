package chap013.sec02.exam02;

// HomeAgency 는 Home을 렌트해주는 대리점 클래스
public class HomeAgency implements Rentable<Home>{
	// 타입 파라미터 T 대신 Home 으로 대체함
	@Override
	public Home rent() { // 리턴 타입이 반드시 Home 이여야 한다
		return new Home();
	}
	

}
