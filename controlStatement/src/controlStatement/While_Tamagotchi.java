package controlStatement;

import java.util.Scanner;

// 5번
// HP: (0/5)

// 밥을 안주면 죽는다.
// 밥을 주면 HP 5가 된다.
// 행동 1번당 HP가 1씩 줄어든다.
// 1. 놀아주기
// 2. 씻겨주기
// 3. 노래하기
// 4. 잠자기
// 5. 밥주기
// 0. 게임 종료

// 만족도 10
// 타마고치 키우기 성공!


public class While_Tamagotchi {
   public static void main(String[] args) {
	  Scanner key = new Scanner(System.in);
	  boolean flag = false;
      String message = "어서오세요~ 타마고치 키우기\n(*￣3￣)╭ \n",
            exampleMessage = "캐릭터를 선택하세요. \n ex)1",
            th = "(╬▔皿▔)╯",
            hm = "(～￣(OO)￣)ブ",
            js = "(っ °Д °;)っ",
            sc = "（；´д｀）ゞ",
      		bk = "(╹ڡ╹ )",
      		tama = "", tamaName = "";
      int choice = 0, hp = 5, exp = 0;
      
      System.out.println(message);
      System.out.println(exampleMessage);
      System.out.println("1. 태히 " + th);
      System.out.println("2. 안민 " + hm);
      System.out.println("3. 준섬 " + js);
      System.out.println("4. 승창 " + sc);
      System.out.println("5. 병군 " + bk);
      
      choice = key.nextInt();
      if(choice == 1) {
    	  tama = th;
      } else if (choice == 2) {
    	  tama = hm;
      } else if (choice == 3) {
		  tama = js;
	  } else if (choice == 4) {
		  tama = sc;
	  } else if (choice == 5) {
		  tama = bk;
	  }
      
      System.out.println("타마의 이름을 입력하세요");
      tamaName = key.next();
      System.out.println("타마 선택:" + tama);
      System.out.println("타마 이름:" + tamaName);

      while(true) {
    	  System.out.println("행동을 입력하세요. \n ex)1 \n"
    			  + "1. 놀아주기\n"
    			  + "2. 노래하기\n"    	  
    			  + "3. 잠자기\n"
    			  + "0. 게임종료");
    	  choice = key.nextInt();
    	  
    	  switch(choice) {
	    	  case 1:
	    		  System.out.println(tamaName + "이(가) 즐거워합니다.");
	    		  System.out.println(tama + "룰루 ~ ♬");
	    		  break;
	    	  case 2:
	    		  System.out.println(tamaName + "이(가) 노래를 부릅니다.");
	    		  System.out.println(tama + "ㅅㅅㅅㅅㅍㄴㅂ ~ ♬");
	    		  break;
	    	  case 3:
	    		  System.out.println(tamaName + "꿈나라로 떠납니다..zzz");
	    		  hp = 5;
	    		  break;
	    	  case 0:
	    		  flag = true;
	    		  break;
	    	  default:
	    		  System.out.println("다시 입력해주세요");
	    		  break;
    	  }
    	  if(flag) {break;}
    	  hp--;
    	  exp++;
    	  System.out.printf("현재 경험치 (%d/%d) \n 현자 체력 (%d/%d)", exp, 10, hp, 5);
    	  
    	  if(hp == 0) {
    		  System.err.println(tama + tamaName + "이(가) 좋은 곳으로 갔씁니다.");
    		  break;
    	  }
    	  if(exp == 10) {
    		  System.out.println("축하합니다~! \n" + tama + tamaName + "이(가) 우주로 떠납니다.");
    		  break;
    	  }
    	  
      }
   }
}












