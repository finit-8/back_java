package anonymousTask;

public interface Form {

	// 1. 메뉴 등록
	public void registerMenus(String[] menus);
	
	// 2. 메뉴 보기
	// 판매 상품을 받아서 판매 메뉴를 보여주는 메서드
	public void showMenus();
		
	// 3. 메뉴 판매
	// 판매 중인 메뉴에 있으면 "판매완료", 아니라면 "판매준비중"
	public void sell(String menu);
}
