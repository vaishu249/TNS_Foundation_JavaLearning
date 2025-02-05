public class P11NestedForLoop {
    public static void main(String[] args) {
        int beg=10;
        int end=20;
        for (int i = beg; i <end ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.print(i+" X "+j+" = "+i*j+"  ");
            }
            System.out.println("Complete "+i+" Table");
        }
    }
}
