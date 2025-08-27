package castingTask3;

public class Animation extends Contents {
	
	public Animation() {
		super("스티치", "가족", 7);		// 기본생성자로 부모생성자한테 값 전달 (부모의 접근제어자가 프라이빗이라도, 부모의 생성자는 public이므로 부모 생성자한테 값을 주고, 부모 생성자가 직접 필드 초기화함)
	}
	
   public void provideSub() {
	      System.out.println(super.getTitle() + " 자막 지원");		// 부모클래스의 타이틀이 프라이빗이라 getTitle()로 가져옴. 출력은 "스티치 자막지원"
	   }
   
}

