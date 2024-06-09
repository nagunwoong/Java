package ch01.sec01.exam01;

public class Team {

	public static void main(String[] args) {
		
		String[] classgroup = {"김민준", "나건웅", "이재민" };
		for(int i = 0; i < classgroup.length; i++) {
			String classnum = classgroup[i];
			System.out.println( classnum + "이 상담을 받음");
		}
		
	}

}
