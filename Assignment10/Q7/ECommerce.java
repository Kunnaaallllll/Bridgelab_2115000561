public class ECommerce {
    public static void main(String[] args) {
        
        Product product1 = new Product("Laptop", 1000.00);
        Product product2 = new Product("Smartphone", 500.00);
        Product product3 = new Product("Headphones", 150.00);

        
        Customer customer1 = new Customer("Alice");

        Order order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order();
        order2.addProduct(product3);

        customer1.placeOrder(order1);
        customer1.placeOrder(order2);

        customer1.showOrders();
    }
}