package chap09.sec05.exam03;

import chap09.sec06.exam02.Button.ClickListener;

public class Button {
	//중첩 인터페이스 선언
	//정적 멤버 인터페이스
	public static interface ClickListener {
		//추상 메소드
		void onClick();
		
	}
	private ClickListener ClickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.ClickListener = clickListener;
}
	
	// Button 이 클릭 되었을때 실행하는 메소드로 선언
	public void click() {
		this.ClickListener.onClick();
	}
	
	
}
