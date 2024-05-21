package chap14.sec06.exam02;

public class WorkObject {
 
	public synchronized void methoda() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + "methodA 작업 실행");
		notify(); // 다른 스레드를 실행 대기 상태로 만듬
		try {
			wait(); // 자신의 스래드는 일시 정지 상태로 만듬
		}catch(InterruptedException e) {
			
		}
	}
	
	public synchronized void methodaB() { //동기화 메소
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + "methodB 작업 실행");
		notify(); //다른 스레드를 실행 대기 상태로 만듬
		try {
			wait(); //
		}catch(InterruptedException e) {
			
		}
		
	}
	
}
