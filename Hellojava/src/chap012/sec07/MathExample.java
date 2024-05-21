package chap012.sec07;

public class MathExample {

	public static void main(String[] args) {
		double v1 = Math.ceil(5.3); //올림값
		double v2 = Math.floor(5.3); // 내림값
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);
		
		long v3 = Math.max(3, 7); // 최대값
		long v4 = Math.min(3, 7); // 최소값
		System.out.println("v3 = " + v3);
		System.out.println("v4 = " + v4);
		
		
		double value = 12.34124445;
		double temp1 = value * 100;
		System.out.println("temp1 = " + temp1);
		
		
		long temp2 = Math.round(temp1); //반올림
		System.out.println("temp2 = " + temp2);
		double v5 = temp2 / 100.0;
		System.out.println("v5 = " + v5);
		int v6 = Math.abs(-100); //절대값
		System.out.println("v6 = " + v6);
		
	}

}
