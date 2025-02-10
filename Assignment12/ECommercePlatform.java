import java.util.*;

class ECommercePlatform{
	public static void main(String[]args){
		List<Product> products = new ArrayList<>();
		Electronics electronics = new Electronics(1001, "Mobile", 20000);
		Clothing clothing = new Clothing(1002, "Kurta", 2000);
		Groceries groceries = new Groceries(1003, "Tomatoes", 200);
		
		
		products.add(electronics);
		products.add(clothing);
		products.add(groceries);

		for (Product product : products) {
            product.displayDetails();
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0;
            double finalPrice = product.getProductPrice() + tax - product.calculateDiscount();

            System.out.println("Discount: " + product.calculateDiscount());
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println();
        }
	}
}
abstract class Product{
	private int productId, price;
	private String name;
	Product(int productId, String name, int price){
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	abstract double calculateDiscount();
	public void displayDetails(){
		System.out.println("Product Id: "+ productId);
		System.out.println("Product Name: "+ name);
		System.out.println("Product Price: "+ price);
	}
	public int getProductPrice(){
		return price;
	}
	public void setProductPrice(int price){
		if(price>0)
			this.price = price;
	}
}
class Electronics extends Product implements Taxable{
	Electronics(int productId, String name, int price){
		super(productId, name, price);		
	}
	@Override
	double calculateDiscount(){
		return getProductPrice()*0.10;
	}
	public double calculateTax(){
		return getProductPrice()*0.15;
	}
	public String getTaxDetails(){
		return "Electronics Tax: 15%";
	}

}
class Clothing extends Product implements Taxable{
	Clothing(int productId, String name, int price){
		super(productId, name, price);		
	}
	@Override
	double calculateDiscount(){
		return getProductPrice()*0.15;
	}
	public double calculateTax(){
		return getProductPrice()*0.12;
	}
	public String getTaxDetails(){
		return "Electronics Tax: 12%";
	}
}
class Groceries extends Product implements Taxable{
	Groceries(int productId, String name, int price){
		super(productId, name, price);		
	}
	@Override
	double calculateDiscount(){
		return getProductPrice()*0.05;
	}
	public double calculateTax(){
		return getProductPrice()*0.08;
	}
	public String getTaxDetails(){
		return "Electronics Tax: 8%";
	}
}

interface Taxable{
	double calculateTax();
	String getTaxDetails();
}