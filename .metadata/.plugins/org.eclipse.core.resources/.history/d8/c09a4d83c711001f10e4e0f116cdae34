package chap17.sec11;


import java.util.Arrays;
import java.util.List;

public class ReductionExample {

   public static void main(String[] args) {
      List<Student> studentList = Arrays.asList(
            new Student("이동진", 28),
            new Student("이동건", 29),
            new Student("이동숙", 30)
            );
      
      // 방법 1
      int sum1 = studentList.stream()
            .mapToInt(Student :: getScore)
            .sum();
      
      
      int sum2 = studentList.stream()
            .map(Student :: getScore)
            .reduce(0, (a,b) -> a+b);
      
      System.out.println("sum1:" + sum1);
      System.out.println("sum2:" + sum2);

   }

}