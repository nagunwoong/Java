package chap14.sec09.exxam01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) {
		// 스레드 풀 생성(최대 5개의 스레드 운영)하고 종료
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		// 스레드 종료
		executorService.shutdownNow();
		//shutdownNow()는 남아있는 작업과 상관없이 강제 종류함
		
		
		
	}

}
