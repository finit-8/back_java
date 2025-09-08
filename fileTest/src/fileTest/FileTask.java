package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileTask {
   public static void main(String[] args) throws IOException{
//      음식 4개 작성 -> foods.txt
//      음식 1개당 1줄씩 사용
//      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("foods.txt", true));
//      String[] foods = {"리조또", "봉골레 파스타", "피자", "스테이크"};
//      Arrays.asList(foods).stream().forEach(food -> {
//         try {
//            bufferedWriter.write(food + "\n");
////            bufferedWriter.newLine(); // 비추 
//         } catch (IOException e) {
//            e.printStackTrace();
//         }
//      });
//      
//      System.out.println("foods.txt 파일을 생성했습니다.");
//      bufferedWriter.close();
      
//      foods.txt
//      음식을 모두 가져와서 콘솔에 출력
//      BufferedReader bufferedReader = new BufferedReader(new FileReader("foods.txt"));
//      String line = null;
//      while((line = bufferedReader.readLine()) != null) {
//         System.out.println(line);
//      }
//      bufferedReader.close();
      
//      값 수정
//      "봉골레 파스타" -> "알리오올리오 파스타"로 변경
//      BufferedReader bufferedReader = new BufferedReader(new FileReader("foods.txt"));
//      String line = null, temp = "";
//   
//      while((line = bufferedReader.readLine()) != null) {
//         if(line.equals("봉골레 파스타")) {
//            temp += "알리오올리오 파스타\n";
//            continue;
//         }
//         temp += line + "\n";
//      }
//      bufferedReader.close();
//      
//      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("foods_v2.txt", true));
//      bufferedWriter.write(temp);
//      
//      System.out.println("foods.txt 수정 했습니다.");
//      bufferedWriter.close();
      
      
//      "알리오올리오 파스타" 삭제
      BufferedReader bufferedReader = new BufferedReader(new FileReader("foods.txt"));
      String line = null, temp = "";
   
      while((line = bufferedReader.readLine()) != null) {
         if(line.equals("봉골레 파스타")) {
            continue;
         }
         temp += line + "\n";
      }
      bufferedReader.close();
      
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("foods_v2.txt", false));
      bufferedWriter.write(temp);
      
      System.out.println("foods.txt 수정 했습니다.");
      bufferedWriter.close();
      
      
      
      
   }
}

