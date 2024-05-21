package chap012.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExxample {

	public static void main(String[] args) {
		//선택번호
		
		int[] selectNumber = new int[6]; //선택번호 6개가 저장된 배열
		Random random = new Random(3); // Random 객체 생성
		System.out.print("선택 번호 = ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45)+1; 
			//random.nextInt : int 타입의 난수를 리턴 (0<= n)
			System.out.print(selectNumber[i] + " ");
			
		}
		
		System.out.println();
		
		
		// 당첨 번호
		int[] winNumber = new int[6]; //당첨 번호 6개 저장될 배열
		random = new Random(5);
		System.out.print("당첨번호 : ");
		for(int i=0; i<6; i++) {
			winNumber[i] = random.nextInt(45)+1; 
			//random.nextInt : int 타입의 난수를 리턴 (0<= n)
			System.out.print(winNumber[i] + " ");
		
	}
		System.out.println();
		
		//당첨 여부
		Arrays.sort(selectNumber); // 배열 항목 정렬
		Arrays.sort(winNumber);
		boolean result = Arrays.equals(selectNumber, winNumber);
		// 배열 항목 비교하기
		System.out.println("당첨 여부 : ");
		if(result) {
			System.out.println("1등에 당첨되셨습니다");
			
		}else {
			System.out.println("당첨되지 않았습니다");
		}
		/* random 메소드 : 0.0 ~ 1.0 사이의 double  타입 난수를 리턴함
		 * int num = (int)(Math.random()*n) + start;
		 * start 부터 시작하는 n개의 정수를 얻는 공식 (start<= ~ (start +n))
		 */
	}
}
