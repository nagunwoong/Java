package ch01.sec01.exam01;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		// (System.in) : 사용자가 입력한 값
		
		Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			System.out.println(i*1000);
			sc.close();
		
	}

}
