package chap14.sec05.exam02;

public class JoinExample {

	public static void main(String[] args) {
		
		SumThread sumThread = new SumThread();
		sumThread.start(); // 생성된 작업 스래드(SumThread)의 run 메소드를 실행
		try {
			sumThread.join();
			//sumThread 가 종료할때까지 main 스레드는 일시 정지함
		}catch(InterruptedException e) {
			
		}
		System.out.println("1~100 합계 : " + sumThread.getSum());
	}

}
