import java.util.*;

public class ShoppingCart {
    private static Map<String,Integer> priceMap=new HashMap<>();
    private static Map<String,Integer> orderMap=new LinkedHashMap<>();
    private static Map<String,Integer> sortedMap=new TreeMap<>(Comparator.comparing(priceMap::get));

    public static void addItem(String item,int price) {
        priceMap.put(item,price);
        orderMap.put(item,price);
        sortedMap.put(item,price);
    }

    public static void displayHashMap() {
        System.out.println("HashMap (Product Prices):");
        priceMap.forEach((item,price)->System.out.println(item+":"+price));
    }

    public static void displayLinkedHashMap() {
        System.out.println("LinkedHashMap (Order of Items):");
        orderMap.forEach((item,price)->System.out.println(item+":"+price));
    }

    public static void displayTreeMap() {
        System.out.println("TreeMap (Sorted by Price):");
        sortedMap.forEach((item,price)->System.out.println(item+":"+price));
    }

    public static void main(String[] args) {
        addItem("Laptop",50000);
        addItem("Phone",30000);
        addItem("Tablet",20000);
        addItem("Headphones",5000);
        addItem("Mouse",1500);

        displayHashMap();
        displayLinkedHashMap();
        displayTreeMap();
    }
}
