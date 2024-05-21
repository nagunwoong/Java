package chap09.sec06.exam02;

public class Button {
	//중첩 인터페이스 선언
	//정적 멤버 인터페이스
	public static interface ClickListener {
		//추상 메소드
		void onClick();
		
	}
	//중첩 인터페이스타입으로 필드와 Setter 를 선언
	//필드 선언
	private ClickListener ClickListener;
	//Setter 를 선언
	// Setter 메소드는 인스턴스 변수를 대입하거나 수정하는 작업
	public void setClickListener(ClickListener clickListener) {
		this.ClickListener = clickListener;
	}
	
	
}
