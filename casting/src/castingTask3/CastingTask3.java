package castingTask3;

// 넷플릭스
// 애니메이션, 영화, 드라마 클래스 선언
// 사용자가 선택한 영상이
// 애니메이션이라면 "자막 지원" 기능 사용
// 영화라면 "4D" 기능 사용
// 드라마라면 "굿즈" 기능 사용
public class CastingTask3 {
   public static void main(String[] args) {
//	애니메이션, 드라마, 뮤비 출력 방법	   
	   Contents Anime = new User().watch(new Animation());
	   Contents drama = new User().watch(new Drama());
	   Contents movies = new User().watch(new Movie("시네마 천국", "드라마", 15));
	   
	   System.out.println("");
	   
// 배열로 출력 방법	   
      User user = new User();
      
      Contents[] movie = {
            new Movie("F1", "레이싱/액션", 15),
            new Movie("BB프로젝트", "액션", 15)
      };
      
      for(Contents content: movie) {
         user.watch(content);
      }
   
      System.out.println("");
      
// User 사용 안하고 바로 메인에서 출력 
	  Contents contents1 = new Animation();
	  Contents contents2 = new Drama();
	  Contents contents3 = new Movie("가버나움", "드라마/다큐", 12);
	  
	  if(contents1 instanceof Animation) {
		  contents1.show();
		  Animation animation = (Animation) contents1;
		  animation.provideSub();
	  }
	  if(contents2 instanceof Drama) {
		  contents2.show();
		  Drama dramaaa = (Drama) contents2;
		  dramaaa.provideGoods();
	  }
	  if(contents3 instanceof Movie) {
		  contents3.show(); 
		  Movie movieee = (Movie) contents3;
		  movieee.provide4D();
	  }
   }
}