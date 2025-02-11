package P20GetterSetter;

public class GetterSetter {
    private String name;
    private String pCity;

    public GetterSetter() {
    }

    public GetterSetter(String name, String pCity) {
        this.name = name;
        this.pCity = pCity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getpCity() {
        return pCity;
    }

    public void setpCity(String pCity) {
        this.pCity = pCity;
    }

    @Override
    public String toString() {
        return "P20GetterSetter{" +
                "name='" + name + '\'' +
                ", pCity='" + pCity + '\'' +
                '}';
    }
}
