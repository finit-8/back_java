package castingTask4_Answer;

public class MarketMember_Answer extends Customer_Answer{
   public MarketMember_Answer() {;}
   public MarketMember_Answer(String name, String phone, long money) {
      super(name, phone, money);
   }
   
   {
      super.setDiscount(30);
   }
}