package chap17.sec10;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class OptionalExample {

   public static void main(String[] args) {
      List<Integer> list = new ArrayList<>();
      
      OptionalDouble optional = list.stream()
                  .mapToInt(Integer ::intValue)
                  .average();
      if(optional.isPresent()) {
         System.out.println("평균" + optional.getAsDouble());
      } else {
         System.out.println("평균없음");
      }
            
      double avg = list.stream()
    		  .mapToInt(Integer::intValue)
    		  .average()
    		  .orElse(0.0);
      // orElse(0.0) : 집계값이 없을 경우를 대비해서 디퐁트값을 놓음
      System.out.println("평균 : " + avg);
     
    
     
   }

}