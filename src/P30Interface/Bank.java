package P30Interface;

public interface Bank {
    final static float MIN_Balance=5000;
    final static float Deposit_Limit=25000;
    public void deposit(float amount);
    public void withdraw(float amount);
}
