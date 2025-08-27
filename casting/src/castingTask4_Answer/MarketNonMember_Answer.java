package castingTask4_Answer;

public class MarketNonMember_Answer extends Customer_Answer{
   public MarketNonMember_Answer() {;}
   public MarketNonMember_Answer(String name, String phone, long money) {
      super(name, phone, money);
   }
   
   {
      super.setDiscount(5);
   }
}
