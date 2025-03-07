package CoreJavaProject.entities;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private String address;
    private ShoppingCart shoppingCart;
    private List<Order> orders;

    public Customer(int userId, String username, String email, String address) {
        super(userId, username, email);
        this.address = address;
        this.shoppingCart = new ShoppingCart();
        this.orders = new ArrayList<>();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
