package P30Interface;

public class Saving_Account extends Customer implements Bank{
    private int accNo;
    private float balance;

    public Saving_Account(String city, String name, int accNo, float balance) {
        super(city, name);
        this.accNo = accNo;
        this.balance = balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void deposit(float amount){
        if(amount<0 || amount>Deposit_Limit){
            System.out.println("Please deposit valid amount ");
        }
        else{
            balance+=amount;
            System.out.println("Rs "+amount+" Deposit Successfully..");
        }
    }
    public void withdraw(float amount){
        if(amount<=balance-MIN_Balance){
            balance-=amount;
            System.out.println("Rs "+amount+" Withdraw successfully..");
        }
        else{
            System.out.println("Insufficent Balance ");
        }
    }

    @Override
    public String toString() {
        return "Saving_Account{" +super.toString()+
                "accNo=" + accNo +
                ", balance=" + balance +
                '}';
    }
}
