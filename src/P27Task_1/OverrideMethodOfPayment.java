package P27Task_1;

public class OverrideMethodOfPayment {
    public void Display(int amount,long CardNumber,String CardHolder){
        System.out.println("Payment Successfully...");
    }
    public void Display(int amount,int userId,String BankName,String Password){
        System.out.println("Payment Successfully...");
    }
    public void Display(int amount,String QRCode,int Pin){
        System.out.println("Payment Successfully...");
    }
    public void Display(int amount,long PhoneNo,int pin){
        System.out.println("Payment Successfully...");
    }
}
