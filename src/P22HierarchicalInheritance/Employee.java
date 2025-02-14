package P22HierarchicalInheritance;

public class Employee extends Person{
    private int empId;
    private float salary;
    private String dept;

    public Employee() {
        empId=11;
        salary=20000;
        dept="comp";
    }

    public Employee(String city, String name, String dept, int empId, float salary) {
        super(city, name);
        this.dept = dept;
        this.empId = empId;
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dept='" + dept + '\'' +
                ", empId=" + empId +
                ", salary=" + salary +
                '}';
    }
}
