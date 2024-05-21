package chap15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		// Queue 컬랙션 생성(FIFO 구조)
		Queue<Message> messageQueue = new LinkedList<>();
		
		
		// 메시지를 큐에 넣기 : offer() 메소드 이용
		messageQueue.offer(new Message("sendMail","홍길동")); //1
		messageQueue.offer(new Message("sendSMS","나건웅")); //2
		messageQueue.offer(new Message("sendkakaotalk","김범수")); //3
		
		
		// 메세지를 하나싹 꺼내어 처리함 : poll() 메소드 이용
		while(!messageQueue.isEmpty()) { // 큐가 비어있지 않다면 while 문 반복
			Message message = messageQueue.poll(); //message 객체를 하나 꺼내
			switch(message.command) {
			case "sendMail" : 
				System.out.println(message.to + "님에게 메일을 보냅니다");
				break;
			case "sendSMS" :
				System.out.println(message.to + "님에게 문자를 보냅니다");
				break;
			case "sendkakaotalk" :
				System.out.println(message.to + "님에게 카카오톡을 보냅니다");
			}
		}
		
	}

}
