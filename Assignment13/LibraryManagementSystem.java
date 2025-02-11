public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book head = null;
        head = Book.addBookAtBeginning("mela", "Arush", "Kahani", 101, true, head);
        head = Book.addBookAtEnd("Sayari", "Ayush", "Kavita", 102, false, head);
        head = Book.addBookAtEnd("Mitti Ki Khushbu", "Kunal", "Upanyas", 103, true, head);
        Book.displayBooksForward(head);
        System.out.println();
        Book.displayBooksReverse(head);
    }
}
class Book {
    String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;
    Book next;
    Book prev;

    public Book(String title, String author, String genre, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }

    public static Book addBookAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable, Book head) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (head != null) {
            newBook.next = head;
            head.prev = newBook;
        }
        return newBook;
    }

    public static Book addBookAtEnd(String title, String author, String genre, int bookId, boolean isAvailable, Book head) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (head == null) {
            return newBook;
        }
        Book temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newBook;
        newBook.prev = temp;
        return head;
    }

    public static Book removeBook(int bookId, Book head) {
        if (head == null) {
            return null;
        }
        if (head.bookId == bookId) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }
        Book temp = head;
        while (temp.next != null && temp.next.bookId != bookId) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
            if (temp.next != null) {
                temp.next.prev = temp;
            }
        }
        return head;
    }

    public static void searchBookByTitle(String title, Book head) {
        while (head != null) {
            if (head.title.equals(title)) {
                System.out.println("Book Found: " + head.title + " by " + head.author);
                return;
            }
            head = head.next;
        }
        System.out.println("Book not found.");
    }

    public static void updateAvailability(int bookId, Book head, boolean status) {
        while (head != null) {
            if (head.bookId == bookId) {
                head.isAvailable = status;
                System.out.println("Availability Updated.");
                return;
            }
            head = head.next;
        }
        System.out.println("Book not found.");
    }

    public static void displayBooksForward(Book head) {
        while (head != null) {
            System.out.println(head.title + " by " + head.author + " - " + head.genre + " - Available: " + head.isAvailable);
            head = head.next;
        }
    }

    public static void displayBooksReverse(Book head) {
        if (head == null) return;
        Book temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.println(temp.title + " by " + temp.author + " - " + temp.genre + " - Available: " + temp.isAvailable);
            temp = temp.prev;
        }
    }
}
