package castingTask3;

public class Animation extends Contents {
	
//	String title;
//	String genre;
//	int watchingRemitAge;
	public Animation() {;}
	public Animation(String title, String genre, int watchingRemitAge) {		// 부모의 필드를 매개변수로 받음
		super(title, genre, watchingRemitAge);									// 다시 부모한테 보냄?
	}
	
   public void showSubTitle() {
	      System.out.println(super.getTitle() + " 자막 지원");
	   }
	
//	public String provideSub() {
//		boolean sub = false;
//		String possibleSub = "";
//		if(sub == true) {
//			possibleSub = super.getTitle() + "자막 지원";							// 부모의 private에 접근
//		} else if(sub == false) {
//			possibleSub = super.getTitle() + "자막 미지원";
//		}
//		return possibleSub;
//	}
   
}

