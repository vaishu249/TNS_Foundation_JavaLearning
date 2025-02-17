package P25FinalKeyword;

public class FinalVariable {
    // must be initialize final int x;
    final int x=100;

    final static  int y;

    final static  int z=100;
    //instance methods
    void change(){
        // final keyword can not be re-assign  x=20;
        // can not assign the value to y y=10;
    }

    @Override
    public String toString() {
        return "FinalVariable{" +
                "x=" + x +" y="+y+
                '}';
    }
    static {
        y=200;
        System.out.println("y="+y);
    }

    public static void main(String[] args) {
        FinalVariable f=new FinalVariable();
        System.out.println(f);
    }
}
