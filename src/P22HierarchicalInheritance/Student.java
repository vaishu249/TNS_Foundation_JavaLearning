package P22HierarchicalInheritance;

public class Student extends Person{
    private String clas;
    private float percent;

    public Student() {
        System.out.println("Stdent constructor");
        clas="BE";
        percent=98;
    }

    public Student(String city, String name, String clas, float percent) {
        super(city, name);
        this.clas = clas;
        this.percent = percent;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public float getPercent() {
        return percent;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return super.toString()+"Student{" +
                "clas='" + clas + '\'' +
                ", percent=" + percent +
                '}';
    }
}
