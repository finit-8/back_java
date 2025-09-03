package collectionTest.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTask3 {
	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();
		
		products.add(new Product(1L, "컴퓨터", 800000, 20));
		products.add(new Product(2L, "책상", 150000, 100));
		products.add(new Product(3L, "마우스", 50000, 15));
		products.add(new Product(4L, "모니터", 300000, 150));
		products.add(new Product(5L, "키보드", 30000, 80));
		
		System.out.println(products);
		
		// 1-1. 재고가 100개 이상인 상품만 출력
		for(int i = 0; i < products.size(); i++) {			
			if(Integer.valueOf(products.get(i).getStock()) >= 100) {
				System.out.println(products.get(i));
			}
		}
		
		// 1-2. 재고가 100개 이상인 상품만 출력
		for(Product product : products) {
			if(product.getStock() >= 100) {
				System.out.println(product);
			}
		}
		
		
		// 2. 마우스 가격을 100000원으로 변경 
	      Product foundProduct = null;
	      for(Product product: products) {
	         if(product.getId() == 3L) {
	        	 foundProduct = product;
	         }
	      }
	      foundProduct.setPrice(100000);
	      
	      try {
	         if(products.contains(foundProduct)) {
	            products.set(products.indexOf(foundProduct), foundProduct);
	         }
	      } catch (IndexOutOfBoundsException e) {
	         System.out.println("ArrayListTask3 예외 발생");
	         System.out.println("인덱스 똑바로 입력하세요.");
	      } catch (Exception e) {
	         System.out.println("ArrayListTask3 예외 발생");
	         System.out.println("알 수 없는 예외 발생");
	         e.printStackTrace();
	      }
	      
	      System.out.println(products);
	      

	      // 3. 상품 이름이 마우스인 상품 삭제
	      for(int i = 0; i < products.size(); i++) {
	    	  if(products.get(i).getName().equals("마우스")) {
	    		  products.remove(products.indexOf(products.get(i))); 		// 어레이리스트. 리스트 형태. 배열. 배열 안에 객체화 된 클래스 X
	    	  }
	      }
	      System.out.println(products);

	      
	      // 4-1. 상품 재고가 100개 이하인 상품을 삭제
//	      ArrayList<Product> newProduct = new ArrayList<Product>();
//	      for(Product product : products) {
//	    	  if(product.getStock() > 100) {
//	    		  newProduct.add(product);
//	    	  }
//	      }
//	      products = newProduct;
//	      System.out.println(products);
	      
	      
	      
	      
	      // ↓ 미결
	      // 4-2. 상품 재고가 100개 이하인 상품을 삭제
//	      for(Product product : products) {						// 빠른 for문 : 자체적으로 이터레이터 순회하지만 이터레이터 몰래 순회하는거라 remove시, 
	      														//				이터레이터가 뒤늦게 알고 ConcurrentModificationException 발생시킴
	      Iterator<Product> iteration = products.iterator();	// ==> 이터레이터 반복자로 안전하게 순회하여 안전하게 삭제
	      	while(iteration.hasNext()) {
	      		Product product = iteration.next();
//      			System.out.println(product);
      			if(product.getStock() <= 100) {
      				iteration.remove();
	      		}
	      	}
	      System.out.println(products);	      			      
	}
}
