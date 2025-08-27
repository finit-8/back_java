package castingTask3;

// 넷플릭스
// 애니메이션, 영화, 드라마 클래스 선언
// 사용자가 선택한 영상이
// 애니메이션이라면 "자막 지원" 기능 사용
// 영화라면 "4D" 기능 사용
// 드라마라면 "굿즈" 기능 사용
public class CastingTask3 {
   public static void main(String[] args) {
//	애니메이션, 드라마 출력 방법	   
	   Contents contents1 = new User().watch(new Animation());
	   contents1 = new User().watch(new Drama());
	   
	   
// 뮤비 출력 방법	   
     User user = new User("ss0258", "****");
      
      Contents[] contents2 = {
            new Movie("F1", "레이싱/액션", 15)
      };
      
      for(Contents content: contents2) {
         user.watch(content);
      }
      
   }
}