package chap14.sec09.exxam02;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableSubmitExample {

	public static void main(String[] args) {
		
		//ExecutorService 생성
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		//계산 작업 생성 밒 처리 요청
		for(int i=1; i<=100; i++) {
			final int idx = i;
			Future<Integer> future = executorService.submit(new Callable<Integer>() {
				@Override
				public Integer call() throws Exception {
					int sum = 0;
					for(int i=0; i<=idx; i++) {
							sum += i;
					}
					Thread thread = Thread.currentThread();
					//어떤 스레드가 계산 처리를 했는지 알수 있도록 출력
					System.out.println("[" + thread.getName() + "] 1~" +  idx + "합 게산");
					return sum; // 작업 처리 결과를 리턴함
				}
			});
			try {
				int result = future.get();// Callable 의 call
				System.out.println("\t리턴값" + result);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		// executorService 종료 작업 (스레드 풀 종료)
		executorService.shutdown();
	}

}