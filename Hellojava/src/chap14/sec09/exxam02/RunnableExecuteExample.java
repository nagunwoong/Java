package chap14.sec09.exxam02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteExample {

	public static void main(String[] args) {
		// 1000개의 runnable 을 생성한 다음 execute() 메소드를 작업큐에 넣음
		// ==> ExecutorService 는 최대 5개 스레드로 작업 큐에서 runnable
		// 하나씩 꺼내어 run 메소드를 실행하면서 작업을 처리함
		
		//1000개의 메일 생성
		String[][] mails = new String[1000][3];
		for(int i=0; i<mails.length; i++) {
			mails[i][0] = "damin@my.com";
			mails[i][1] = "member" + i + "com";
			mails[i][2] = "신상품 입";
		}
		
		// executorService 생성 : 스레드 풀 생성 (최대 5개의 스레드 운용)
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		for(int i=0; i<1000; i++) {
			final int idx = i;
			executorService.execute(new Runnable() {
				@Override
				public void run() {
					Thread thread = Thread.currentThread();
					String from = mails[idx][0];
					String to = mails[idx][1];
					String content = mails[idx][2];
					System.out.println("[" + thread.getName() + "]"
							+ from + "==>" + to + ":" + content);
				}
			});
		}
		
		//ExecutorService 종료
		executorService.shutdown();
		//shutdown
		//현재 처리중인 작업뿐만 아니라 작업 후에 대기하고 있는 모든 작업을 
		//처리한 후에 스레드를 종료시킴
	}
	}