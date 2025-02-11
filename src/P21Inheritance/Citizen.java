package P21Inheritance;

public class Citizen {
    private String name;
    private long adharNum;
    private String Address;

    public Citizen(String name, long adharNum, String address) {
        this.name = name;
        this.adharNum = adharNum;
        Address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public long getAdharNum() {
        return adharNum;
    }

    public void setAdharNum(long adharNum) {
        this.adharNum = adharNum;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", adharNum=" + adharNum +
                ", Address='" + Address + '\'' +
                '}';
    }
}
