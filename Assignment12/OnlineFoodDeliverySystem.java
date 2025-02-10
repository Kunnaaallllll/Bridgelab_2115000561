public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItems processOrder1=new VegItem("apple",100,4);
        FoodItems processOrder2=new NonVegItem("Chicken",100,4);
        System.out.println("total price for Veg Item is : "+ processOrder1.calculateTotalPrice());
        System.out.println("total price for Non-Veg Item is : "+ processOrder2.calculateTotalPrice());
        processOrder1.getItemDetails();
        System.out.println("Discount on Veg Item is : "+((Discountable)processOrder1).applyDiscount());
        processOrder2.getItemDetails();
        System.out.println("discount on NonVeg Item is : "+((Discountable)processOrder2).applyDiscount());
    }
}
abstract class FoodItems{
    private String itemName;
    private int price;
    private int quantity;

    FoodItems(String itemName,int price,int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }
    abstract int calculateTotalPrice();

    public void getItemDetails(){
        System.out.println("item name is : "+itemName);
        System.out.println("price of item is : "+price);
        System.out.println("quantity for this item is : "+quantity);
    }
    public int getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
}

class VegItem extends FoodItems implements Discountable{

VegItem(String itemName,int price,int quantity){
    super(itemName,price,quantity);
}
@Override
int calculateTotalPrice(){
int totalPrice=getPrice()*getQuantity();
return totalPrice;
}
@Override
    public int applyDiscount(){
    int totalPrice=calculateTotalPrice();
    int result=totalPrice*10/100;
    return result;
}
@Override
    public int getDiscountDetails(){
    return applyDiscount();
}
}

class NonVegItem extends FoodItems implements Discountable{
    NonVegItem(String itemName, int price, int quantity) {
        super(itemName, price, quantity);
    }
    @Override
    int calculateTotalPrice(){
        int totalPrice=getPrice()*getQuantity();
        return totalPrice+50;
    }
    @Override
    public int applyDiscount(){
        int totalPrice=calculateTotalPrice();
        int result=totalPrice*10/100;
        return result;
    }
    @Override
    public int getDiscountDetails(){
        return applyDiscount();
    }
}

interface Discountable{
    int applyDiscount();
    int getDiscountDetails();
}