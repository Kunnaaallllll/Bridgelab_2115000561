public class Product {

    private String productName;
    private double price;
    private static int totalProducts = 0; 
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1200);
        Product product2 = new Product("Mouse", 25);
        Product product3 = new Product("Keyboard", 75);

        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();

        Product.displayTotalProducts();
    }
}