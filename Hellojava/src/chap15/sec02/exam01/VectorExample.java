package chap15.sec02.exam01;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		//threadA,threadB에서 동시에 Board 객체를 각각 1000개씩
		// 추가한후, 전체 저장된 수를 출력
		
		// vector 컬랙션 생성
		List<Board> list = new Vector<>();
		
		//작업 스래드 객체 생성
		Thread threadA = new Thread() {
			@Override
			public void run() {
				// 객체 1000개 추가
				for(int i=0; i<=1000; i++) {
					list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};
		
		// 작업 스레드 객체 생성 : threadB
		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				// 객체 1000개 추가
				for(int i=0; i<=1000; i++) {
					list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};
		
		//작업 스래드 실행
		threadA.start();
		threadB.start();
		
		//작업 스레드들이 모두 종료될때까지 메인 스레드를 기다리게함
		try {
			threadA.join(); // threadA가 끝날때까지 메인 스레드는 기다림
			threadB.join();
		}catch(Exception e) {
			
		}
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		
	}

}
