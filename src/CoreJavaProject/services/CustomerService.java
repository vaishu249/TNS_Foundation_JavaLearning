package CoreJavaProject.services;

import CoreJavaProject.entities.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private List<Customer> customerList;

    public CustomerService() {
        this.customerList = new ArrayList<>();
    }

    public void createCustomer(int id, String username, String email, String address) {
        customerList.add(new Customer(id, username, email, address));
        System.out.println("Customer created successfully!");
    }

    public void viewCustomers() {
        if (customerList.isEmpty()) {
            System.out.println("No customers available.");
        } else {
            for (Customer c : customerList) {
                System.out.println("User ID: " + c.getUserId() + ", Username: " + c.getUsername() + ", Email: " + c.getEmail() + ", Address: " + c.getAddress());
            }
        }
    }

    public Customer findCustomerById(int customerId) {
        for (Customer c : customerList) {
            if (c.getUserId() == customerId) {
                return c;
            }
        }
        return null;
    }
}

