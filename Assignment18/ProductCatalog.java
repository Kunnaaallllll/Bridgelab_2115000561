import java.util.*;
class ProductCatalog {
public static void main(String[] args) {
Catalog<Book> books = new Catalog<>();
books.addItem(new Book("kunal", 50));
books.addItem(new Book("lord", 70));

Catalog<Clothing> clothes = new Catalog<>();
clothes.addItem(new Clothing("shirt", 300));
clothes.addItem(new Clothing("jeans", 120));

Catalog<Gadget> gadgets = new Catalog<>();
gadgets.addItem(new Gadget("smartphone", 2000));
gadgets.addItem(new Gadget("laptop", 5000));

System.out.println("Book Catalog:");
Catalog.displayItems(books.getItems());

System.out.println("Clothing Catalog:");
Catalog.displayItems(clothes.getItems());

System.out.println("Gadget Catalog:");
Catalog.displayItems(gadgets.getItems());

System.out.println("\nApplying Discounts:");
applyDiscount(books.getItems(), 10);
applyDiscount(clothes.getItems(), 20);
applyDiscount(gadgets.getItems(), 5);

System.out.println("Book Catalog after Discount:");
Catalog.displayItems(books.getItems());

System.out.println("Clothing Catalog after Discount:");
Catalog.displayItems(clothes.getItems());

System.out.println("Gadget Catalog after Discount:");
Catalog.displayItems(gadgets.getItems());
}

static <T extends Product> void applyDiscount(List<T> items, double percentage) {
for (T item : items) {
item.setPrice(item.getPrice() - (item.getPrice() * percentage / 100));
}
}
}

abstract class Product {
private String name;
private double price;

Product(String name, double price) {
this.name = name;
this.price = price;
}

public String getName() {
return name;
}

public double getPrice() {
return price;
}

public void setPrice(double price) {
this.price = price;
}
}

class Book extends Product {
Book(String name, double price) {
super(name, price);
}
}

class Clothing extends Product {
Clothing(String name, double price) {
super(name, price);
}
}

class Gadget extends Product {
Gadget(String name, double price) {
super(name, price);
}
}

class Catalog<T extends Product> {
private List<T> items = new ArrayList<>();

void addItem(T item) {
items.add(item);
}

List<T> getItems() {
return items;
}

public static void displayItems(List<? extends Product> items) {
for (Product item : items) {
System.out.println(item.getName() + " - " + item.getPrice());
}
}
}