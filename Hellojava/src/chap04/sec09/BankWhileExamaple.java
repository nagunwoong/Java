package chap04.sec09;

import java.util.Scanner;

public class BankWhileExamaple {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int money1 = 0;
		int money2 = 0;
		int money3 = 0;
		
		while (true) {
			System.out.println("---------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("---------------------");
			
		String select = sc.nextLine();
		
		if (select.equals("1")) {
			System.out.println("예금액 >");
			money1 += Integer.parseInt(sc.nextLine());
			
			
		}else if (select.equals("2")) {
			System.out.println("출금액 >");
			money2 += Integer.parseInt(sc.nextLine());
			
		}else if (select.equals("3")) {
			System.out.println("잔고 > " + (money1 - money2));
		
		}else {
			break;
		}
		
		
		}
	}

}
