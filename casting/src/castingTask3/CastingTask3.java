package castingTask3;

// 넷플릭스
// 애니메이션, 영화, 드라마 클래스 선언
// 사용자가 선택한 영상이
// 애니메이션이라면 "자막 지원" 기능 사용
// 영화라면 "4D" 기능 사용
// 드라마라면 "굿즈" 기능 사용
public class CastingTask3 {
   public static void main(String[] args) {
      Contents contents = new Contents("넷플릭스", "", 19900);
      Video[] videos = {
            new Animation("드래곤 길들이기", 160),
            new Drama("폭삭 삭았수다!", 100),
            new Movie("F1", 120)};
      
      for(Video video: videos) {
         netflix.show(video);
      }
      
   }
}