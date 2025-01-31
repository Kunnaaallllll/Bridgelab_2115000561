public class Book{
    private String title;
    private String author;
    private int price;

    public Book(String title , String author , int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("The title of the book is: "+ title);
        System.out.println("The author of the book is: "+ author);
        System.out.println("The price of the book is: "+ price);
    }

}