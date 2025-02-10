public class P18Encapsulation {
    private String name;
    private int serialNo;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "P18Encapsulation{" +
                "name='" + name + '\'' +
                ", serialNo=" + serialNo +
                ", age='" + age + '\'' +
                '}';
    }

    public static void main(String[] args) {
        P18Encapsulation P18=new P18Encapsulation();
        P18.setAge(21);
        P18.setName("Vaishnavi");
        P18.setSerialNo(1);
        System.out.println(P18);
    }
}
