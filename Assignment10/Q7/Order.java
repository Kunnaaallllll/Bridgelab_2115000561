import java.util.*;
public class Order {
    private List<Product> products;
    private int orderId;
    private static int idCounter = 1;

    public Order() {
        this.products = new ArrayList<>();
        this.orderId = idCounter++;
    }

    public int getOrderId() {
        return orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalAmount() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Total Amount: $" + getTotalAmount();
    }
}