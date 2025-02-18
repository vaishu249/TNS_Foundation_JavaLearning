package P26Overloading;

public class
TestConstructor {
    public static void main(String[] args) {
        System.out.println("Constructor Overloading ");
        ConstructorOverloading c=new ConstructorOverloading();
        System.out.println(c);
        ConstructorOverloading c2=new ConstructorOverloading(12.5f);
        System.out.println(c2);
        ConstructorOverloading c3=new ConstructorOverloading(1.1f,2.5f);
        System.out.println(c3);
    }
}
