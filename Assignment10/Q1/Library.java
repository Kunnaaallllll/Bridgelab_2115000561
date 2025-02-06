import java.util.*;
public class Library {
    private String name;
    private List<Book> books;

    public Library(String name){
        this.name = name;
        books = new ArrayList<>();
    }

    public void addBooks(Book book){
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Books in " + name + " are: ");
        int serial_number =1;
        for (Book book : books) {
            System.out.print(serial_number+".");
            System.out.println("  Title: " + book.getTitle());
            System.out.println("    Author name: " + book.getAuthor());
            serial_number++;
        }
    }
}