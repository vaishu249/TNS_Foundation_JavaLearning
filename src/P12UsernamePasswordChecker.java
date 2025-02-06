import java.util.Scanner;

public class P12UsernamePasswordChecker {
    public static void main(String[] args) {
        String userName = "Vaishnavi";
        String password = "vaishu@2409";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter User Name: ");
        String uName = input.nextLine();
        System.out.print("Enter Your Password: ");
        String pass = input.nextLine();

        if(uName.equals(userName) && pass.equals(password)){
            System.out.println("Welcome User");
        } else if (uName.equals(userName) && !pass.equals(password)) {
            System.out.println("Invalid Password");
        } else if (!uName.equals(userName) && pass.equals(password)) {
            System.out.println("Invalid User-Name");
        }
        else if (!uName.equals(userName) && !pass.equals(password)) {
            System.out.println("Invalid Credentials");
        }
    }
}
