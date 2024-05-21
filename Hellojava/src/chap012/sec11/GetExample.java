package chap012.sec11;

public class GetExample {

	public static void main(String[] args) throws Exception {
		 // 방법1 (클래스 이름만 가지고 Class 객체를 얻는 방법)
	      // Class clazz = Car.class;
	      // Class clazz1 = String.class;
	      
	      // 방법 2 (클래스 이름만 가지고 Class 객체를 얻는 방법)
	       //Class clazz = Class.forName("chap12.sec11.Car");
	      // Class clazz1 = Class.forName("java.lang.String");
	      
	      // 방법 3(객체로부터 Class 객체를 얻는 방법)
	      Car car = new Car();
	      Class clazz = car.getClass();
	      
	      String str = "회오리감자";
	      Class clazz1 = str.getClass();
	      
	      System.out.println("패키지: " + clazz.getPackage().getName());
	      // getPackage() : 패키지 정보 읽기
	      // getName() : 패키지를 포함한 전체 타입 이름
	      System.out.println("클래스의 간단 이름: " + clazz.getSimpleName());
	      //getSimpleName() : 패키지를 제외한 타입 이름
	      System.out.println("클래스의 전체 이름: " + clazz.getName());
	      System.out.println();
	      System.out.println("패키지 : " +clazz1.getPackage().getName());
	      System.out.println("클래스의 간단 이름: " + clazz1.getSimpleName());
	      System.out.println("클래스의 전체 이름: " + clazz1.getName());

	   }

	}