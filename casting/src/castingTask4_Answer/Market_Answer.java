package castingTask4_Answer;

import castingTask4.MarketMember;
import castingTask4.MarketNonMember;
import castingTask4.Product;

//Market
//- 필드: 이름

//- 메서드:
//   2. 상품 등록
//   - 상품 등록은 최대 5개까지만 할 수 있다.
//   (즉, 6개를 전달해도 앞에 5개 상품만 등록된다)
//   - 마트에 같은 이름의 상품은 등록할 수 없다.

//   1. 상품 판매
//      - 등록된 상품만 판매할 수 있다.
//      - 유저가 가진 돈보다 적으면 판매할 수 없다.
//      - 유저가 마다의 할인율이 적용된다.
//         1. 비회원 할인율 5% 적용
//         2. 멤버 할인율 30% 적용
//      - 등록된 상품의 재고보다 작으면 판매할 수 없다.

//
//   3. 포인트 적립 메서드
//      - 비회원은 5%
//      - 회원은 10%

//   4. 만약 비회원이라면 
//   쿠폰 1장 제공, 쿠폰이 10장이라면 상품 무료!

public class Market_Answer {
   private String name;
   private final int MAX_COUNT = 5;
   private Product[] products;
   
   {
      Product[] products = new Product[this.getMAX_COUNT()];
      this.setProducts(products);
   }
   
   public Market_Answer() {;}
   public Market_Answer(String name) {
      this.name = name;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getMAX_COUNT() {
      return MAX_COUNT;
   }
   public Product[] getProducts() {
      return products;
   }
   public void setProducts(Product[] products) {
      this.products = products;
   }
   
//   상품 리스트 조회 메서드
   public void showProducts() {
      for(Product product: this.getProducts()) {
         System.out.print(product.getProductName() + ", ");
      }
   }
   
//   상품 중복 체크 메서드
   public boolean checkProduct(Product product) {
      boolean check = false;
      for(Product p : this.getProducts()) {
         if(p != null) {
            if(p.getProductName().equals(product.getProductName())) {
               System.out.println("중복된 상품입니다.");
               check = true;
            }
         }
      }
      return check;
   }
   
//   단일 상품 등록
   public void registerProduct(Product product) {
      Product[] products = this.getProducts();
      
      for(int i = 0; i < products.length; i++) {
//         1. 이미 상품이 있다면
         if(products[i] != null) {
            if(this.checkProduct(product)) {
               break;
            }
            continue;
         }
         
//         2. 상품이 비어있다면
         if(products[i] == null) {
            products[i] = product;
            System.out.println(product.getProductName() + " 상품을 등록했습니다.");
            break;
         }
         
      }
   };
   
//   다중 상품 등록
   public void registerProducts(Product[] products) {
//      내가 등록하려는 상품 리스트
      for(Product product: products) {
         if(this.checkProduct(product)) {
            continue;
         }
         this.registerProduct(product);
      }
   };
   
   public void sell(Customer customer, String productName, int stock) {
      Product product = new Product(productName, stock);
//      상품이 있다면 판매
      if(this.checkProduct(product)) {
         Product foundProduct = null;
         for(Product p : this.getProducts()) {
            if(p.getProductName().equals(productName)) {
               foundProduct = p;
            }
         }
//         상품의 재고
//         유저의 돈
         if(foundProduct.getProductStock() > 0 && customer.getMoney() >= foundProduct.getProductPrice()) {
            if(foundProduct.getProductStock() - stock >= 0) {
//               재고 변경
               if(customer instanceof MarketMember) {
                  foundProduct.setProductStock(foundProduct.getProductStock() - stock);
                  customer.setMoney(customer.getMoney() - (foundProduct.getProductPrice() - (foundProduct.getProductPrice() * customer.getDiscount() / 100)));
               }else if(customer instanceof MarketNonMember){
                  if(customer.getCoupon() >= 10) {
                     System.out.println("상품 증정");
                  }else {
                     foundProduct.setProductStock(foundProduct.getProductStock() - stock);
                     customer.setMoney(customer.getMoney() - (foundProduct.getProductPrice() - (foundProduct.getProductPrice() * customer.getDiscount() / 100)));
                     customer.setCoupon(customer.getCoupon() + 1);
                  }
               }
               System.out.println("판매 완료^^");
            }
         }
      }
   }
   
   
   
}

















