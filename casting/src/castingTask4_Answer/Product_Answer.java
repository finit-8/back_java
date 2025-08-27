package castingTask4_Answer;

//Product 상품
//- 필드: 이름, 가격, 재고
public class Product_Answer {
   private String productName;
   private int productPrice;
   private int productStock;
   
   public Product_Answer() {;}
   public Product_Answer(String productName, int productPrice, int productStock) {
      super();
      this.productName = productName;
      this.productPrice = productPrice;
      this.productStock = productStock;
   }
   
   public String getProductName() {
      return productName;
   }
   public void setProductName(String productName) {
      this.productName = productName;
   }
   public int getProductPrice() {
      return productPrice;
   }
   public void setProductPrice(int productPrice) {
      this.productPrice = productPrice;
   }
   public int getProductStock() {
      return productStock;
   }
   public void setProductStock(int productStock) {
      this.productStock = productStock;
   }
}
