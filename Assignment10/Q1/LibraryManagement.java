public class LibraryManagement{
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "James Gosling");
        Book book2 = new Book("Web Development", "Tim Berners-Lee");
        Book book3 = new Book("Data Structures", "Robert Lafore");
        Book book4 = new Book("Algorithms", "Robert Sedgewick");

        Library library1 = new Library("City library");
        Library library2 = new Library("University Library");
        library1.addBooks(book1);
        library1.addBooks(book3);
        library2.addBooks(book2);
        library2.addBooks(book4);

        library1.displayBooks();
        library2.displayBooks();
    }
}