package P16TaxCalculation;

import java.util.Scanner;

public class TestTax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name=input.nextLine();
        System.out.println("Enter Your Age : ");
        int age=input.nextInt();
        input.nextLine();
        System.out.println("Enter Your Gender : ");
        String gender=input.nextLine();
        System.out.println("Enter Your Income : ");
        int income=input.nextInt();
        //ScannerClassTax pay object

        Person p=new Person();
        p.setName(name);
        p.setAge(age);
        p.setGender(gender);
        p.setIncome(income);

        //tax calculation
        TaxCalculate pc=new TaxCalculate();
        pc.calculateTax(p);

        System.out.println(p.toString());
    }
}
