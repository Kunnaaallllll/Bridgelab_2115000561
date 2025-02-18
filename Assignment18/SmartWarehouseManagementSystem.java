import java.util.*;
abstract class WarehouseItem{
    private String name;
    WarehouseItem(String name ){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
class Electronics extends WarehouseItem{
    Electronics(String name){
        super(name);
    }
}
class Groceries extends WarehouseItem {
    Groceries(String name){super(name);}
}

class Furniture extends WarehouseItem {
    Furniture(String name){super(name);}
}

class Storage<T extends WarehouseItem>{
List<T> list;
Storage(){
    list =new ArrayList<>();
}
public void addItems(T item){
    list.add(item);
}
public List<T> getItems(){
    return list;
}
    public static void displayItems(List<? extends WarehouseItem> list){
        for(WarehouseItem w:list){
            System.out.println(w.getName());
        }
    }
}
public class SmartWarehouseManagementSystem {
    public static void main(String[] args) {
        Storage<Electronics> e=new Storage<>();
        Storage<Groceries> g=new Storage<>();
        Storage<Furniture> f=new Storage<>();
        System.out.println("electronic items are : ");
        e.addItems(new Electronics("Laptop"));
        e.addItems(new Electronics("Smartphone"));
        System.out.println("Groceries items are : ");
        g.addItems(new Groceries("Apple"));
        g.addItems(new Groceries("Banana"));
        System.out.println("Furniture items are : ");
        f.addItems(new Furniture("Chair"));
        f.addItems(new Furniture("Table"));
        Storage.displayItems(e.getItems());
        Storage.displayItems(g.getItems());
        Storage.displayItems(f.getItems());
    }
}
