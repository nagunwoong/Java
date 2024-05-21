package chap08.sec02;

public class Television implements RemoteControl {
	/*implements 키워드는 해당 클래스가 인터페이스를 통해서
	 * 사용할수 없다는 표시임
	 * 인터페이스 추상 메소드를 재정의한 메소드
	 */
 public void turnOn() {
	 System.out.println("TV를 켭니다");
 }
	
}
