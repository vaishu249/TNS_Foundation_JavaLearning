package CoreJavaProject.entities;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<Product, Integer> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public Map<Product, Integer> getItems() {
        return items;
    }

    public void clearCart() {
        items.clear();
    }
}

