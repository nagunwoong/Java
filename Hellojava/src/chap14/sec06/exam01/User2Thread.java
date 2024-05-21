package chap14.sec06.exam01;

public class User2Thread extends Thread{
	private Calculator calculator; // 스레드 이름 변경
	
	public User2Thread() {
		setName("User2Thread"); // 스레드 이름 변
		
	}
	
	public void setCalculator(Calculator calculator) {
		// 외부에서 공유 객체인 
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory2(50);
	}
}
