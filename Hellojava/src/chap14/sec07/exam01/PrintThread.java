package chap14.sec07.exam01;

public class PrintThread extends Thread {
	private boolean stop;
	
	public void setstop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while(!stop) {
			System.out.println("실행중");
		}
		System.out.println("리소ㅓ스 정리");
		System.out.println("실행 종료");
	}
		
}