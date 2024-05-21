package chap05.sec02;

public class ArrayTest1 {

	public static void main(String[] args) {
		String[] name = new String[4];
		name[0] = "나건웅";
		name[1] = "백승곤";
		name[2] = "주선호";
		name[3] = "김영환";
		
		
		System.out.println("name.lenght = " + name.length);
		System.out.println("name[1] = " + name[1]);
		
		int[] jumsu = {70, 80, 90};
		System.out.println("점수 2 = " + jumsu[2]);
	}

}
