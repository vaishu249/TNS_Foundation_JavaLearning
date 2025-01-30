public class P2TypeCasting {
    public static void main(String[] args) {
        //widening or Implicit type casting
        byte b=1;
        int i=b;
        float f=i;
        float ft=(int) 12.5;
        System.out.println(ft);
        char ch='A';
        int ch2=ch;
        System.out.println(ch2);

        //Narrowing or explicit type casting
        double d1=10111111111111.52d;
        long l1=(long) d1;
        System.out.println(l1);
        int it=(int)d1;
        System.out.println(it);
        byte bt=(byte)it;
        System.out.println(bt);
    }
}
