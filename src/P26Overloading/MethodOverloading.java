package P26Overloading;

public class MethodOverloading {
    // 2 int parameter
    public static int add(int a,int b){
        return a+b;
    }
    // 3 int parameter
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    // 2 float parameter
    public static float add(float a,float b){
        return a+b;
    }
    // 4 float parameter
    public static float add(float a,float b,float c,float d){
        return a+b+c+d;
    }
    public static float add(float a,int b){
        return a+b;
    }
    public static String add(String a,String b){
        return a+b;
    }
}
