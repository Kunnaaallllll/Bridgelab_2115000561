import java.util.*;
class LibraryManagement {
    public static void main(String[] args) {
        List<LibraryItem> libraryItems = new ArrayList<>();

        Book book = new Book(10101, "Physics", "HC VERMA");
        Magazine magazine = new Magazine(101, "Harry Potter", "Kunal");
        DVD dvd = new DVD(102, "HC verma", "Arush");

        libraryItems.add(book);
        libraryItems.add(magazine);
        libraryItems.add(dvd);

        for (LibraryItem item : libraryItems) {
            item.getItemDetails();
            System.out.println("Loan Time: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                System.out.println("Availability: " + (reservableItem.checkAvailability() ? "Available" : "Not Available"));
                System.out.println(reservableItem.reserveItem());
            }
            System.out.println("");
        }
    }
}

abstract class LibraryItem {
    private int itemId;
    private String title, author;

    LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Book ID: " + itemId);
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
    }
}

class Book extends LibraryItem implements Reservable {
    private boolean isReserved;

    Book(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    int getLoanDuration() {
        return 15;
    }

    @Override
    public String reserveItem() {
        if (!isReserved) {
            isReserved = true;
            return "Book Reserved successfully!";
        }
        return "Book is Already Reserved.";
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

class Magazine extends LibraryItem {
    Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    int getLoanDuration() {
        return 20;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;

    DVD(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    int getLoanDuration() {
        return 5;
    }

    @Override
    public String reserveItem() {
        if (!isReserved) {
            isReserved = true;
            return "DVD Reserved successfully!";
        }
        return "DVD is Already Reserved.";
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

interface Reservable {
    String reserveItem();
    boolean checkAvailability();
}