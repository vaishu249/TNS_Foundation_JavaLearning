package P23StaticMethodVariable;

public class TestStatic {
    public static void main(String[] args) {
        StaticKeyword.display();
        StaticKeyword p=new StaticKeyword();
        System.out.println(p);

        StaticKeyword.display();
        StaticKeyword p2=new StaticKeyword();
        System.out.println(p2);
    }
}
