package chap012.sec03.exam01;

public class EqualsExample {

	public static void main(String[] args) {
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("yellow");
		
		if(obj1.equals(obj2)) { //매개값이 Member 타입이고, id도 동일 하므로 ture
			System.out.println("obj1 과 obj2는 동등합니다.");
		}else {
			System.out.println("obj1과 obj2는 틀립니다");
		}
		if(obj2.equals(obj3)) { //매개값이 Member 타입이고, id가 다르므로 flase
			System.out.println("obj2 과 obj3는 동등합니다.");
		}else {
			System.out.println("obj2과 obj3는 틀립니다");
		}
	}

}
