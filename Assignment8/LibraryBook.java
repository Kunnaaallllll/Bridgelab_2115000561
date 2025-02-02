class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public String getDetails() {
        return "Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + isAvailable;
    }
}

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 299.99);
        System.out.println(book1.getDetails());
        
        if (book1.borrowBook()) {
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
        
        System.out.println(book1.getDetails());
    }
}
