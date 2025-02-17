package P25FinalKeyword;

public class FinalMethods {
    //constructor

    public FinalMethods() {
        System.out.println("Default Constructor ..");
    }

    final int a =50;

    final void finalMethod(){
        System.out.println("Value of a : "+a);
    }

    void notFinalMethod(){
        System.out.println("notFinalMethod");
    }
}
