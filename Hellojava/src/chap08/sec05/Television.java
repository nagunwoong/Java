package chap08.sec05;


public class Television implements RemoteControl {
	//필드 선언
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("티비를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("티비를 끕니다.");
	}
	@Override
	public void setVolume(int volume) {
		//인터페이스 상수 필드 이용
		if(volume < RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) { 
			this.volume = RemoteControl.MIN_VOLUME;
			
		}else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨 : " 	+ this.volume);
	}
}
