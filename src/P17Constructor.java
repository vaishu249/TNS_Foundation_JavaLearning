import java.sql.SQLOutput;

public class P17Constructor {
    private String custName;
    private int custId;
    private String custCity;

    public P17Constructor() {
        System.out.println("Default Constructor ...");
    }

    public P17Constructor(String custName, int custId, String custCity) {
        this.custName = custName;
        this.custId = custId;
        this.custCity = custCity;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustCity() {
        return custCity;
    }

    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }

    @Override
    public String toString() {
        return "P17Constructor{" +
                "custName='" + custName + '\'' +
                ", custId=" + custId +
                ", custCity='" + custCity + '\'' +
                '}';
    }

    public static void main(String[] args) {
        P17Constructor P=new P17Constructor();
        P.setCustCity("Mumbai");
        P.setCustId(2);
        P.setCustName("Kunal");
        System.out.println(P);
        P17Constructor P2=new P17Constructor("Vaishnavi",1,"Pune");
        System.out.println(P2.toString());
    }
}
