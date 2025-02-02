public class Book{
    private String title;
    private String author;
    private int price;

    public Book(){
        this.title = "";
        this.author = "";
        this.price = 0;
    }
    public Book(String title , String author , int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }


}