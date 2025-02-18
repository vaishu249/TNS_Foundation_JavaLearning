package P28Overriding;

public class Test {
    public static void main(String[] args) {
        RBI_Parent r;
        //Dynamic
        r=new RBI_Parent();
        System.out.println(r.getRateOfIntrest());

        r=new HDFC_Child();
        System.out.println(r.getRateOfIntrest());

        r=new SBIChildClass();
        System.out.println(r.getRateOfIntrest());


        r=new ICIC_Child();
        System.out.println(r.getRateOfIntrest());
    }
}
