package P24StaticVariableWithStaticValue;

public class Employee {
    private String name;
    private int id;
    static String companyName="ABC";

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +"Company Name="+companyName+
                '}';
    }
}

