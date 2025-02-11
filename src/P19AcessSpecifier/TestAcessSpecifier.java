package P19AcessSpecifier;

public class TestAcessSpecifier {
    public static void main(String[] args) {
        AcessSpecifier ac=new AcessSpecifier();
        // ac.privateMethod();  //it does not acess from outside the class
        ac.protectedMethod();
        ac.defaultMethod();
        ac.publicMethod();
    }
}
