package chap15.sec07;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapExample {

	public static void main(String[] args) {
		
		// ThreadA, ThreadB 에서	객체 1000개씩 HashMap에 추가한 후
		
		
		// Map 컬랙션 생성
		Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
		
		//작업 스레드A 객체 생성
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for(int i=0; i<=1000; i++) {
					map.put(i, "내용" + i);
				}
			}
		};
		
		
		//작업 스레드B 객체 생성
				Thread threadB = new Thread() {
					@Override
					public void run() {
						for(int i=0; i<=2000; i++) {
							map.put(i, "내용" + i);
						}
					}
				};
				
			//작업 스래드 실행
			threadA.start(); //run() 메소드 실행
			threadB.start(); //run() 메소드 실행
			// 작업 스래드들이 모두 종료될 때까지 메인 스레드를 기다리게함
			try {
				threadA.join();
				threadB.join();
			}catch(Exception e) {
				
			}
			//저장된 총 객체수 얻기
			int size = map.size();
			System.out.println("총 객체수 : " + size);
			System.out.println();
		
		}
		
	

}
