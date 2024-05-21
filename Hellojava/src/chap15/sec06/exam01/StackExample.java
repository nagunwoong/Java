package chap15.sec06.exam01;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		//stack 컬랙션 생성(LIFO : last in First Out 구조 )
		Stack<Coin> coinBox = new Stack<>();
		
		//동전 넣기
		coinBox.push(new Coin(100)); //1
		coinBox.push(new Coin(50)); //2
		coinBox.push(new Coin(500)); //3
		coinBox.push(new Coin(10)); //4
		
		//동전을 하나씩 꺼내기
		while(!coinBox.isEmpty()) { //비어있지 않다면 while 문을 반복
			Coin coin = coinBox.pop(); // pop 은 스택에서 객체 하나 꺼내오
			System.out.println("꺼내온 동전" + coin.getValue() + "원");
		}
	}

}
