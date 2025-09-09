package dateTest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateTest2 {
	public static void main(String[] args) {
//		Calendar calendar = Calendar();					추상클래스인데 오버라이딩 해야할 게 너무 많아서 이렇게는 객체화 못함
		Calendar calendar = Calendar.getInstance(); 	// 싱글턴패턴 : 하나의 객체를 전역에서 같이 쓰고자 할 때 사용하는 패턴
//		Calendar calendar = Calendar.getInstance(); 	getInstance()는 별개의 객체이기 때문에 싱글턴패턴이 아님. (유저들마다의 캘린더 제공)
		System.out.println(calendar.getTime());

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd/hh/mm/ss");
		System.out.println(calendar.getTime());
		System.out.println(simpleDateFormat.format(calendar.getTime()));
		
		System.out.println();
		
//		프로젝트에 이거 쓰세요^^
		System.out.println("프로젝트에 이거 쓰세요^^");
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2);

		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")));
		
		System.out.println(LocalDate.parse("1900년 10월 10일", DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")));
			//	DB쪽에서 데이터를 String으로 받으면 시간으로 못받는데, 시간으로 받기위해 형변환하는 것.
	}
}










