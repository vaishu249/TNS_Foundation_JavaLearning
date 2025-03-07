package CoreJavaProject.services;

import CoreJavaProject.entities.Order;
import CoreJavaProject.entities.Customer;
import CoreJavaProject.entities.Product;
import java.util.*;

public class OrderService {
    private List<Order> orderList;
    private List<Product> productList;

    public OrderService(List<Product> productList) {
        this.orderList = new ArrayList<>();
        this.productList = productList;
    }

    public void placeOrder(Customer customer, Map<Integer, Integer> productQuantities) {
        Map<Product, Integer> orderedProducts = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : productQuantities.entrySet()) {
            int productId = entry.getKey();
            int quantity = entry.getValue();

            Product product = findProductById(productId);
            if (product != null && quantity > 0) {
                orderedProducts.put(product, quantity);
            } else {
                System.out.println("Invalid product or quantity: " + productId);
                return;
            }
        }

        if (!orderedProducts.isEmpty()) {
            Order order = new Order(customer, orderedProducts);
            orderList.add(order);
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Order could not be placed.");
        }
    }

    public void viewOrders() {
        if (orderList.isEmpty()) {
            System.out.println("No orders available.");
        } else {
            for (Order order : orderList) {
                System.out.println("Order ID: " + order.getOrderId() + ", Status: " + order.getStatus());
                for (Map.Entry<Product, Integer> entry : order.getProducts().entrySet()) {
                    System.out.println("Product: " + entry.getKey().getName() + ", Quantity: " + entry.getValue());
                }
            }
        }
    }

    public void updateOrderStatus(int orderId, String status) {
        for (Order order : orderList) {
            if (order.getOrderId() == orderId) {
                order.setStatus(status);
                System.out.println("Order status updated successfully!");
                return;
            }
        }
        System.out.println("Order not found.");
    }

    private Product findProductById(int productId) {
        for (Product p : productList) {
            if (p.getProductId() == productId) {
                return p;
            }
        }
        return null;
    }
}

