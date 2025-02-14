package P23StaticMethodVariable;

public class StaticKeyword {
    //

    private int section;//non static variable
    private static int sr_no;

    static {
        System.out.println("hello.. It is Static Block.");
        // can not use non static member in static block section=200;
        sr_no=1000;
    }

    public StaticKeyword() {
        System.out.println("Default constructor ...");
        sr_no++;
        section++;
    }


    @Override
    public String toString() {
        return "P23StaticKeyword{" +
                "section=" + section +"Sr no :"+sr_no+
                '}';
    }

    static void display(){
        //non static var can not use in static method    System.out.println("section : "+section );
        System.out.println("Sr no : "+sr_no);
    }

    public static void main(String[] args) {

    }
}
