package chap08.sec05;

public interface RemoteControl {
	//상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	
	//추상 메소드(메소드의 선문만 작성함)
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 디폴트 인스턴스 메소드
	/*인터페이스에는 완전한 실행코드를 가진 default 메소드를 선언 가능
	 * default 메소드는 실행부가 있음
	 * default 키워드는 리턴 타입 앞에 붙음
	 *default 메소드에 실행부에는 상수 필드를 읽거나 
	 *추상 메소드를 호출하는 코드를 작성할수 있음
	 */
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 할게요");
			//추상 매소드 호출하면서 상수 필드 선언
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음을 해제합니다.");
		}
	}
	
}
