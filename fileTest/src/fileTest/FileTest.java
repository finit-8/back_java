package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
   public static void main(String[] args) throws IOException, FileNotFoundException{
//      new FileWriter("경로", "이어쓰기 여부");
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true));
      bufferedWriter.write("와~ 월요일 오전만 아픈 마음의 병 치료 기원!\n배승원 화이팅!");
      bufferedWriter.close();
      
      BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
      String line = null;
      while((line = bufferedReader.readLine()) != null) {
         System.out.println(line);
      }
      bufferedReader.close();
   }
}













