package chap013.sec02.exam01;

public class GenericExample {

	public static void main(String[] args) {
		
		// K대신 Tv로 대체, M 대신에 String으로 대체함
		Product<Tv, String> Product1 = new Product<>();
		
		Product1.setKind(new Tv());
		Product1.setModel("스마트 TV");
		
		// Getter 리턴값은 TV와 String 이 됨
		
		// k대신 car로 대체, m은 String 으로 대체함
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("SUV 자동차");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
		System.out.println(car);
		System.out.println(carModel);
		/*product 
		 * 
		 */
	}

}
