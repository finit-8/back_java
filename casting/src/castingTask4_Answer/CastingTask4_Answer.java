package castingTask4_Answer;
//   - 마트 비회원과, 마트 회원을 객체화 시켜 물품을 구매하시오.

import castingTask4.Market;
import castingTask4.MarketMember;
import castingTask4.Product;

// 결과 확인
public class CastingTask4_Answer {
   public static void main(String[] args) {
      MarketMember hong = new MarketMember_Answer("홍길동", "01044447777", 10000);
      Market market = new Market();
      Product product = new Product_Answer("배승원의 모자", 500, 1);
      Product[] myProducts = {
         new Product_Answer("배승원의 모자", 500, 1),
         new Product_Answer("배승원의 신발", 500, 1),
         new Product_Answer("배승원의 점퍼", 500, 1),
         new Product_Answer("이승찬의 안경", 500, 1),
         new Product_Answer("이승찬의 맥북", 500, 1),
      };
      
      
      market.registerProduct(product);
      market.registerProducts(myProducts);
      
//      상품 구매
      market.sell(hong, "배승원의 모자", 1);
      System.out.println(hong.getMoney());
      
//      상품 조회
      market.showProducts();
   }
}













