package P26Overloading;

public class TestMethod {
    public static void main(String[] args) {
        MethodOverloading m=new MethodOverloading();
        System.out.println("2 no addition "+ m.add(10,20));
        System.out.println("3 no addition "+ m.add(10,20,30));
        System.out.println("2 float no addition "+ m.add(10.5f,20.5f));
        System.out.println("4 float addition "+ m.add(10.5f,20.5f,30.5f,40.5f));
        System.out.println("1 float and 1 int no addition "+ m.add(10.5f,10));
        System.out.println("2 string addition "+ m.add("vaishnavi","Kunal"));
    }
}
