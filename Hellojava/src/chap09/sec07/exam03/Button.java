package chap09.sec07.exam03;

public class Button {
	//정적 맴버 인터페이스
	public static interface ClickListener {
		//추상 메소드
		void onClick();
		
	}
	
	//필드 선언
	private ClickListener ClickListener;
	//메소드 선언

	public void setClickListener(ClickListener clickListener) {
		ClickListener = clickListener;
	}
	
	public void click() {
		this.ClickListener.onClick();
	}
	
}
