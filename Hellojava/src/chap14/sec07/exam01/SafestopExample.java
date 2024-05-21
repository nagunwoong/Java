package chap14.sec07.exam01;

public class SafestopExample {

	public static void main(String[] args) {
		
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		try {
			Thread.sleep(3000);
			
		}catch  (InterruptedException e) {
			
		}
		printThread.setstop(true);
	}

}
