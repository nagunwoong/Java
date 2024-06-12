package ch01.sec01.exam01;

import java.util.Scanner;

public class Scanner2Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// while(sc.hasNextInt()) : 정수 값이 아닌 문자값이 들어오면 실행 중지
		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt()*1000);
		}
		sc.close();
	}

}
