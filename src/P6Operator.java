public class P6Operator {
    public static void main(String[] args) {
        int a=9;
        int b=10;
        int c=a++ +a+ ++b;
        System.out.println(c);
        int d=a++ +c+ ++b;
        System.out.println(d);
    }
}
