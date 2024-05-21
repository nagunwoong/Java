package chap04.sec09;

public class ForSumExample {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=0; i<=100; i++) {
			if(i%3 == 0) {
			sum += i;
			
		}
		System.out.println("더한 값은 : " +sum);
		
	   }
	}
}
