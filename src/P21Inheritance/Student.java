package P21Inheritance;

public class Student extends Citizen {
    public int rollNo;
    private String clgName;

    public Student(String name, long adharNum, String address,int rollNo, String clgName) {
        super(name, adharNum, address);
        this.rollNo = rollNo;
        this.clgName = clgName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getClgName() {
        return clgName;
    }

    public void setClgName(String clgName) {
        this.clgName = clgName;
    }

    @Override
    public String toString() {
        return super.toString()+"Student{" +
                "rollNo=" + rollNo +
                ", clgName='" + clgName + '\'' +
                '}';
    }
}
