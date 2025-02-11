package P20GetterSetter;

public class TestGetSetter {
    public static void main(String[] args) {
        GetterSetter P1=new GetterSetter();
        P1.setName("vaishnavi");
        P1.setpCity("Pune");
        System.out.println(P1);
        GetterSetter P2=new GetterSetter("Kunal","Mumbai");
        System.out.println(P2);
    }
}
