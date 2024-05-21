package chap04.sec05;

import java.util.Scanner;

public class KeyCountrolExample {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("----------");
			System.out.println("1.중속 | 2.강속 | 3.중지");
			System.out.println("----------");
			System.out.println("선택 :");
			String strNum = Scanner.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 = " +speed);
			} else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 =" + speed);
			}	else if(strNum.equals("3")) {
				 run = false;	
				}
			}
		System.out.println("while 다음문장실행중 ==> 프로그램 종");
		}

	}



