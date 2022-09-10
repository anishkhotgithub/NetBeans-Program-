package hidingdata;
class Wallet
{
    private float Money;
    public void setMOney(float Money)
    {
        this.Money=Money;
    }
    public boolean pullOutMoney(float amount)
    {
        if(Money>=amount)
        {
            Money-=amount;
            return true;
        }
        return false;
    }
}
public class HidingData 
{
    public static void main(String[] args)
    {
         Wallet w=new Wallet();
         System.out.println("Putting 500Rs in wallet");
         w.setMOney(500);
         System.out.println("Pulling out 100Rs");
         boolean MoneyInWallet = w.pullOutMoney(100);
         if(MoneyInWallet)
         {
             System.out.println("Got it");
         }
         else
         {
             System.out.println("Not enough money");
         }
         System.out.println("Pulling out 400Rs");
         MoneyInWallet = w.pullOutMoney(300);
         if(MoneyInWallet)
         {
             System.out.println("Got it");
         }
         else
         {
             System.out.println("Not enough money");
         }
         System.out.println("Pulling out 300Rs");
         MoneyInWallet = w.pullOutMoney(300);
         if(MoneyInWallet)
         {
             System.out.println("Got it");
         }
         else
         {
             System.out.println("Not enough money");
         }
    }
    
}
