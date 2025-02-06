package P16TaxCalculation;

import java.util.Scanner;

public class Person {
    Scanner input=new Scanner(System.in);
    private String name;
    private int income;
    private String gender;
    private int age;
    private int tax;

    //getters for variable
    public Scanner getInput() {
        return input;
    }

    public String getName() {
        return name;
    }

    public int getIncome() {
        return income;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getTax() {
        return tax;
    }

    // Setter of class
    public void setInput(Scanner input) {
        this.input = input;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "P16TaxCalculation.P16ScannerClassTaxPay{" +
                "input=" + input +
                ", name='" + name + '\'' +
                ", income=" + income +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", tax=" + tax +
                '}';
    }
}
