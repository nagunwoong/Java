package chap18.sec11;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExample {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      try {
         String data = ""+
                    "id: winter \n"+
                    "email: gaeul@naver.com \n"+
                    "tel: 010-8831-9953";
         Path path = Paths.get("/Library/Temp/user.txt");
         Files.writeString(Paths.get("/Library/Temp/user.txt"), data, Charset.forName("UTF-8"));
         
         System.out.println("파일 유형 : " + Files.probeContentType(path));
         System.out.println("파일 크기 : " + Files.size(path) + " bytes");
         
         String content = Files.readString(path, Charset.forName("UTF-8"));
         System.out.println(content);
         
      } catch (IOException e){
         e.printStackTrace();
      }
      
      //WriteString() : 문자열을 파일에 저장
      //readString() : 텍스트 파일의 내용ㅇ을 전부 읽고 String 으로 리턴
      
      }
   }	

