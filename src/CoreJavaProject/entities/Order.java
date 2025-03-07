package CoreJavaProject.entities;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private static int orderCounter = 1;
    private int orderId;
    private Customer customer;
    private Map<Product, Integer> products;
    private String status;

    public Order(Customer customer, Map<Product, Integer> products) {
        this.orderId = orderCounter++;
        this.customer = customer;
        this.products = new HashMap<>(products);
        this.status = "Pending";
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public static int getOrderCounter() {
        return orderCounter;
    }

    public static void setOrderCounter(int orderCounter) {
        Order.orderCounter = orderCounter;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Integer> products) {
        this.products = products;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
