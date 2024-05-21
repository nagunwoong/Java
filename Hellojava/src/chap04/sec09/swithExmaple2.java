package chap04.sec09;

public class swithExmaple2 {

	public static void main(String[] args) {
		int x;
		int y;
		
		for(x=0; x<=10; x++) {
			for(y=0; y<=10; y++) {
				if((4*x + 5*y) == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}

	}

}
