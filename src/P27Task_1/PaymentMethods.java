package P27Task_1;

import java.util.Scanner;

public class PaymentMethods {
    public static void main(String[] args) {
        //Payment Methods
        Scanner input = new Scanner(System.in);
        String c;
        // object of method Override class
        OverrideMethodOfPayment obj=new OverrideMethodOfPayment();

        do {
            System.out.println("1.Credit/Debit Card");
            System.out.println("2.Net Banking");
            System.out.println("3.UPI (Unified Payments Interface)");
            System.out.println("4.Google Pay");
            System.out.println("Enter Payment method : ");
            int userChoice = input.nextInt();
            System.out.print("Enter the Amount You want To transfer :");
            int amount = input.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.print("Enter Card Number : ");
                    long CardNumber = input.nextLong();
                    input.nextLine();
                    System.out.print("Enter Cardholder Name : ");
                    String CardholderName = input.nextLine();
                    //Override Function call
                    obj.Display(amount,CardNumber,CardholderName);
                    break;
                case 2:
                    System.out.print("Enter User Id : ");
                    int userId = input.nextInt();
                    System.out.print("Enter Bank Name : ");
                    String BankName = input.nextLine();
                    input.nextLine();
                    System.out.print("Enter Password : ");
                    String Password = input.nextLine();
                    //Override Function call
                    obj.Display(amount,userId,BankName,Password);
                    break;
                case 3:
                    System.out.print("Enter UPI/QR code : ");
                    String QRCode = input.next();
                    System.out.print("Enter the PIN : ");
                    int Pin = input.nextInt();
                    //Override Function call
                    obj.Display(amount,QRCode,Pin);
                    break;
                case 4:
                    System.out.print("Enter Phone Number : ");
                    long PhoneNo = input.nextLong();
                    System.out.print("Enter the PIN : ");
                    int pin = input.nextInt();
                    //Override Function call
                    obj.Display(amount,PhoneNo,pin);
                    break;
                default:
                    System.out.println("You enter Wrong Choice please Enter valid choice ....");
            }
            System.out.println("You wanted to pay again ...y/n");
            c = input.next();
        } while (c != "n");
    }
}
