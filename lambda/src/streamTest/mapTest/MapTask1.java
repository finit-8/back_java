package streamTest.mapTest;

import java.util.ArrayList;
import java.util.Arrays;

public class MapTask1 {
	
	public String addRoot(String url) {
		return "/app" + url;
	}
	
	public static void main(String[] args) {
//      아래의 4개의 URL을 List에 담은 후 모든 경로 앞에 /app을 붙여서 출력하기
//      /news, /game, /brand, /rank
      	ArrayList<String> urls = new ArrayList<String>(Arrays.asList("/news", "/game", "/brand", "/rank"));
		urls.stream().map((url) -> "/app" + url).forEach(System.out::println);
		 
		System.out.println();
		
//		메서드 불러오는 방식
		MapTask1 mt = new MapTask1();
		urls.stream().map((url) -> {return mt.addRoot(url);}).forEach(System.out::println);
		
		System.out.println();

// 		Url 클래스파일에서 불러오는 방식
		ArrayList<Url> url_s = new ArrayList<Url>();
		Url url1 = new Url(1L, "/news");
		Url url2 = new Url(2L, "/game");
		Url url3 = new Url(3L, "/brand");
		Url url4 = new Url(4L, "/rank");
		
		url_s.add(url1);
		url_s.add(url2);
		url_s.add(url3);
		url_s.add(url4);
//		System.out.println(url_s);
		
		url_s.stream().map((url) -> {return "/app" + url.getUrl();}).forEach(System.out::println);
		
		
	}
}
