package P22HierarchicalInheritance;

public class Person {
    private String name ;
    private String city;

    public Person() {
        System.out.println("Default constructor ....");
        name="kunal";
        city="Kharadi";
    }

    public Person(String city, String name) {
        this.city = city;
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "city='" + city + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
