class RestaurantManagementSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Amit", 201);
        System.out.println("Chef: " + chef.getName() + " ID: " + chef.getId());
        chef.performDuties();
        
        Waiter waiter = new Waiter("Raj", 301);
        System.out.println("Waiter: " + waiter.getName() + " ID: " + waiter.getId());
        waiter.performDuties();
    }
}

interface Worker {
    void performDuties();
}

class Person {
    private String name;
    private int id;
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println("Preparing food");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println("Serving customers");
    }
}
