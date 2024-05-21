package chap05.sec09;

public class ArryCopyByForExample {

	public static void main(String[] args) {
		int[] oldArray = {1,2,3};
		int[] newIntArray = new int[5];
		for(int i=0; i<oldArray.length; i++) {
			newIntArray[i] = oldArray[i];
		}
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ",");
		}
	}

}
