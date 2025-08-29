package castingTask4;

public class MarketMember extends Customer{
   public MarketMember() {;}
   public MarketMember(String name, String phone, long money) {
      super(name, phone, money);
   }
   
   {
      super.setDiscount(30);
   }
}