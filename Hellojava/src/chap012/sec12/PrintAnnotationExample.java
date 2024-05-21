package chap012.sec12;


import java.lang.reflect.Method;

public class PrintAnnotationExample {

    public static void main(String[] args) throws Exception {
        /* Service 클래스에 선언된 메소드를 리플렉션해서
         * @PrintAnnotation 설정 정보를 얻어낸 후
         * 구분선을 출력하고 해당 메소드를 호출함
         */

        Method[] declaredMethods = Service.class.getDeclaredMethods(); // 메소드 정보 읽기
        for (Method method : declaredMethods) {
            // PrintAnnotation 얻기
            PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

            // 설정 정보를 이용해서 구분선 출력
            printLine(printAnnotation);

            // 메소드 호출
            method.invoke(new Service());

            // 설정 정보를 이용해서 구분선 출력
            printLine(printAnnotation);
        }
    }

    public static void printLine(PrintAnnotation printAnnotation) {
        if (printAnnotation != null) {
            // number 속성값 얻기
            int number = printAnnotation.number();
            for (int i = 0; i < number; i++) {
                // value 속성값 얻기
                String value = printAnnotation.value();
                System.out.print(value);
            }
            System.out.println();
        }
    }

}
