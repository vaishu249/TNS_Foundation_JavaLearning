package P22HierarchicalInheritance;

public class Test {
    public static void main(String[] args) {
        Person p1=new Person();
        System.out.println("Person Detail..");
        System.out.println(p1);

        Person p;
        p=new Person("Mumbai","Vaishnavi");
        System.out.println("Person details : "+p);

        p=new Student("XYZ","Sneha","b",65.67f);
        System.out.println("Person details : "+p);

        p=new Employee("ABC","Vaishali","computer",1234,4567888f);
        System.out.println("Person details : "+p);
    }

}
