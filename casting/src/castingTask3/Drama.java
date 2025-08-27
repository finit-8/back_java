package castingTask3;

public class Drama extends Contents{
		
	void provideGoods() {
		super.setTitle("폭싹 속았수다");		// setter로 부모 필드 값 변경
		System.out.println(super.getTitle() + " 굿즈");  // 부모클래스의 타이틀이 프라이빗이라 getTitle()로 가져옴. 출력은 "폭싹 속았수다 굿즈"
	}
}
