package chap05.sec11;

public class MainStringArrayArgument1 {

	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("프로그럄 종료");
			System.exit(0);
		}
		String strNum1 = args[0];
		String strNum2 = args[1];
		String strNum3 = args[2];
		
		System.out.println("args[0] = " + strNum1);
		System.out.println("args[1] = " + strNum2);
		System.out.println("args[2] = " + strNum3);
		
	}

}
