package castingTask4;

//MarketMember 
//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰

//MarketNonMember
//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰

// grid 모드 alt + shift + a
public class Customer {
//   필드: 이름, 전화번호, 돈, 포인트, 쿠폰
   private String name;
   private String phone;
   private long money;
   private int point;
   private int coupon;
   private int discount;
   
   public Customer() {;}
   public Customer(String name, String phone, long money) {
      this.name = name;
      this.phone = phone;
      this.money = money;
   }
   
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getPhone() {
      return phone;
   }
   public void setPhone(String phone) {
      this.phone = phone;
   }
   public long getMoney() {
      return money;
   }
   public void setMoney(long money) {
      this.money = money;
   }
   public int getPoint() {
      return point;
   }
   public void setPoint(int point) {
      this.point = point;
   }
   public int getCoupon() {
      return coupon;
   }
   public void setCoupon(int coupon) {
      this.coupon = coupon;
   }
   public int getDiscount() {
      return discount;
   }
   public void setDiscount(int discount) {
      this.discount = discount;
   }
   
}





