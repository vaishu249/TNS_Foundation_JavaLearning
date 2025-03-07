package CoreJavaProject.services;

import CoreJavaProject.entities.Admin;
import CoreJavaProject.entities.Product;
import java.util.ArrayList;
import java.util.List;

public class AdminService {
    private List<Product> productList;
    private List<Admin> adminList;

    public AdminService() {
        this.productList = new ArrayList<>();
        this.adminList = new ArrayList<>();
    }

    public void addProduct(int id, String name, double price, int stock) {
        productList.add(new Product(id, name, price, stock));
        System.out.println("Product added successfully!");
    }

    public void viewProducts() {
        if (productList.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product p : productList) {
                System.out.println("Product [ID=" + p.getProductId() + ", Name=" + p.getName() + ", Price=" + p.getPrice() + ", Stock=" + p.getStockQuantity() + "]");
            }
        }
    }

    public void createAdmin(int id, String username, String email) {
        adminList.add(new Admin(id, username, email));
        System.out.println("Admin created successfully!");
    }

    public void viewAdmins() {
        if (adminList.isEmpty()) {
            System.out.println("No admins available.");
        } else {
            for (Admin a : adminList) {
                System.out.println("Admin ID: " + a.getUserId() + ", Username: " + a.getUsername() + ", Email: " + a.getEmail());
            }
        }
    }

    public List<Product> getProductList() {
        return productList;
    }
}

