package P34TryCatch;

public class tryCatch {
    public static void exceptionHandling(int a,int b){
        try{
            int div=a/b;
            System.out.println(div);
            System.out.println("Sucessfully divide ");
        } catch (Exception e) {
            System.out.println("Divide by zero..");
        }
        finally {
            System.out.println("Run sucessfully..");
        }
    }

    public static void main(String[] args) {
        exceptionHandling(20,2);
        exceptionHandling(20,0);
    }
}
