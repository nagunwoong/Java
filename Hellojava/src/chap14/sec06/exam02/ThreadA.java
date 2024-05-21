package chap14.sec06.exam02;

public class ThreadA extends Thread{
	
	private WorkObject workobject;
	
	public ThreadA(WorkObject workobject) { //공유 작업 객체를 받음
		setName("ThreadA"); //스레드 이름 변경
		this.workobject = workobject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workobject.methoda(); //동기화 메소드 호출
		}
	}
	
}
