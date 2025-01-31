import java.util.*;
public class main3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the title of the book: ");
        String title = sc.nextLine();
        System.out.print("Enter the author of the book: ");
        String author = sc.nextLine();
        System.out.print("Enter the price: ");
        int price = sc.nextInt();
        Book bk = new Book(title , author , price);
        bk.displayDetails();
    }
}
