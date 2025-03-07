package CoreJavaProject;
import CoreJavaProject.services.AdminService;
import CoreJavaProject.services.CustomerService;
import CoreJavaProject.services.OrderService;
import CoreJavaProject.entities.Customer;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdminService adminService = new AdminService();
        CustomerService customerService = new CustomerService();
        OrderService orderService = new OrderService(adminService.getProductList());

        while (true) {
            System.out.println("1. Admin Menu\n2. Customer Menu\n3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                adminMenu(scanner, adminService, orderService);
            } else if (choice == 2) {
                customerMenu(scanner, customerService, orderService, adminService);
            } else {
                System.out.println("Exiting...");
                break;
            }
        }
        scanner.close();
    }

    private static void adminMenu(Scanner scanner, AdminService adminService, OrderService orderService) {
        while (true) {
            System.out.println("Admin Menu:");
            System.out.println("1. Add Product\n2. View Products\n3. Create Admin\n4. View Admins\n5. Update Order Status\n6. View Orders\n7. Return");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter Product ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Product Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Product Price: ");
                double price = scanner.nextDouble();
                System.out.print("Enter Stock Quantity: ");
                int stock = scanner.nextInt();
                adminService.addProduct(id, name, price, stock);
            } else if (choice == 2) {
                adminService.viewProducts();
            } else if (choice == 3) {
                System.out.print("Enter Admin ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Username: ");
                String username = scanner.nextLine();
                System.out.print("Enter Email: ");
                String email = scanner.nextLine();
                adminService.createAdmin(id, username, email);
            } else if (choice == 4) {
                adminService.viewAdmins();
            } else if (choice == 5) {
                System.out.print("Enter Order ID: ");
                int orderId = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter new status (Completed/Delivered/Cancelled): ");
                String status = scanner.nextLine();
                orderService.updateOrderStatus(orderId, status);
            } else if (choice == 6) {
                orderService.viewOrders();
            } else {
                System.out.println("Exiting Admin Menu...");
                break;
            }
        }
    }

    private static void customerMenu(Scanner scanner, CustomerService customerService, OrderService orderService, AdminService adminService) {
        while (true) {
            System.out.println("Customer Menu:");
            System.out.println("1. Create Customer\n2. View Customers\n3. Place Order\n4. View Orders\n5. View Products\n6. Return");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter User ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Username: ");
                String username = scanner.nextLine();
                System.out.print("Enter Email: ");
                String email = scanner.nextLine();
                System.out.print("Enter Address: ");
                String address = scanner.nextLine();
                customerService.createCustomer(id, username, email, address);
            } else if (choice == 2) {
                customerService.viewCustomers();
            } else if (choice == 3) {
                System.out.print("Enter Customer ID: ");
                int customerId = scanner.nextInt();
                Customer customer = customerService.findCustomerById(customerId);
                if (customer == null) {
                    System.out.println("Customer not found.");
                    continue;
                }

                Map<Integer, Integer> productQuantities = new HashMap<>();
                while (true) {
                    System.out.print("Enter Product ID to add to order (or -1 to complete): ");
                    int productId = scanner.nextInt();
                    if (productId == -1) break;

                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    productQuantities.put(productId, quantity);
                }

                orderService.placeOrder(customer, productQuantities);
            } else if (choice == 4) {
                orderService.viewOrders();
            } else if (choice == 5) {
                adminService.viewProducts();
            } else {
                System.out.println("Exiting Customer Menu...");
                break;
            }
        }
    }
}
