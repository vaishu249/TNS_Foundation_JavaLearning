package P30Interface;

public class TestInterface {
    public static void main(String[] args) {
        Saving_Account s=new Saving_Account("Pune","XYZ",123,20000);
        s.deposit(2000);
        System.out.println(s);
        s.withdraw(40000);
        System.out.println(s);
    }
}
