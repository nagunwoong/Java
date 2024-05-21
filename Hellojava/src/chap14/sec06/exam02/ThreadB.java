package chap14.sec06.exam02;

public class ThreadB extends Thread{
	
	
private WorkObject workobject;
	
	public ThreadB(WorkObject workobject) { //공유 작업 객체를 받음
		setName("ThreadB"); //스레드 이름 변경
		this.workobject = workobject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workobject.methodaB(); //동기화 메소드 호출
		}
	}
	
}
