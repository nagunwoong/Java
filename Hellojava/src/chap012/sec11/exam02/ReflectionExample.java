package chap012.sec11.exam02;

import java.lang.reflect.*;

import chap012.sec11.exam02.Car;

public class ReflectionExample {

    public static void main(String[] args) throws Exception {
        Class clazz = Car.class;
        System.out.println("[생성자 정보]");
        Constructor[] constructors = clazz.getDeclaredConstructors();
        // getDeclaredConstructors() : 생성자 정보 읽기
        for (Constructor constructor : constructors) {
            System.out.print(constructor.getName() + "(");//getName(): 패키지를 포함한 전체 타입 이름
            Class[] parameters = constructor.getParameterTypes();
            printParameters(parameters);
            System.out.println(")");
        }
        System.out.println();

        System.out.println("[필드 정보]");
        Field[] fields = clazz.getDeclaredFields();
        // getDeclaredFields() :  필드 정보 읽기
        for (Field field : fields) {
            System.out.println(field.getType().getName() + " " + field.getName());
        }
        System.out.println();
    }

    private static void printParameters(Class[] parameters) {
        for (int i = 0; i < parameters.length; i++) {
            System.out.println(parameters[i].getName());
        }
    }
}