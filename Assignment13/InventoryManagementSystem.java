public class InventoryManagementSystem {
    public static void main(String[] args) {
        Node head = null;
        head = Node.addItemAtBeginning("Apple", 101, 10, 5.5, head);
        head = Node.addItemAtEnd("Banana", 102, 15, 3.0, head);
        head = Node.addItemAtEnd("Orange", 103, 12, 4.0, head);
        head = Node.sortInventoryByPrice(head, true);
        Node.displayInventory(head);
    }
}
class Node {
    String itemName;
    int itemId;
    int quantity;
    double price;
    Node next;
    public Node(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
    public static Node addItemAtBeginning(String itemName, int itemId, int quantity, double price, Node head) {
        Node newNode = new Node(itemName, itemId, quantity, price);
        newNode.next = head;
        return newNode;
    }

    public static Node addItemAtEnd(String itemName, int itemId, int quantity, double price, Node head) {
        Node newNode = new Node(itemName, itemId, quantity, price);
        if (head == null) {
            return newNode;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static Node removeItem(int itemId, Node head) {
        if (head == null) {
            return null;
        }
        if (head.itemId == itemId) {
            return head.next;
        }
        Node temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        return head;
    }
    public static void updateQuantity(int itemId, Node head, int quantity) {
        while (head != null) {
            if (head.itemId == itemId) {
                head.quantity = quantity;
                System.out.println("Quantity updated successfully.");
                return;
            }
            head = head.next;
        }
        System.out.println("Item not found.");
    }
    public static boolean searchItem(String itemName, Node head) {
        while (head != null) {
            if (head.itemName.equals(itemName)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
    public static int totalValueOfInventory(Node head) {
        int totalValue = 0;
        while (head != null) {
            totalValue += head.quantity * head.price;
            head = head.next;
        }
        return totalValue;
    }
    public static Node sortInventoryByPrice(Node head, boolean ascending) {
        if (head == null || head.next == null) return head;
        boolean swapped;
        do {
            swapped = false;
            Node temp = head;
            while (temp.next != null) {
                if ((ascending && temp.price > temp.next.price) || (!ascending && temp.price < temp.next.price)) {
                    double tempPrice = temp.price;
                    temp.price = temp.next.price;
                    temp.next.price = tempPrice;
                    int tempId = temp.itemId;
                    temp.itemId = temp.next.itemId;
                    temp.next.itemId = tempId;
                    int tempQty = temp.quantity;
                    temp.quantity = temp.next.quantity;
                    temp.next.quantity = tempQty;
                    String tempName = temp.itemName;
                    temp.itemName = temp.next.itemName;
                    temp.next.itemName = tempName;
                    swapped = true;
                }
                temp = temp.next;
            }
        } while (swapped);
        return head;
    }
    public static void displayInventory(Node head) {
        while (head != null) {
            System.out.println("Item: " + head.itemName + ", ID: " + head.itemId + ", Quantity: " + head.quantity + ", Price: " + head.price);
            head = head.next;
        }
    }
}
