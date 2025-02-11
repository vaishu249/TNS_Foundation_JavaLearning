package P19AcessSpecifier;

public class AcessSpecifier {
    //default: with in class and package
    int varDefault=0;
    public int varpublic=10;
    private int varprivate=12;
    protected int varProtected=11;

     void defaultMethod(){
        System.out.println("default method");
        System.out.println(varDefault);
    }
    public void publicMethod(){
        System.out.println("Public method");
        System.out.println(varpublic);
    }
    private void privateMethod(){
        System.out.println("Private method");
        System.out.println(varprivate);
    }
    protected void protectedMethod(){
        System.out.println("Protected method");
        System.out.println(varProtected);
    }

}
