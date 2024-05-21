package chap14.sec08;

public class AutoSaveThread extends Thread {
	
	public void save() {
		System.out.println("작업 내용을 저장함");
	}
	// 1초 주기로 save 라고 하는 메소드를 호출하는 AutoSaveThread를 데몬 스레드로
	//실행시킴
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				
			}catch(InterruptedException e) {
				break;
			}
			save();
		}
	}
}
