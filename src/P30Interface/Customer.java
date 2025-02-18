package P30Interface;

public class Customer {
    private String name;
    private String city;

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

    public Customer() {
    }

    public Customer(String city, String name) {
        this.city = city;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "city='" + city + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

