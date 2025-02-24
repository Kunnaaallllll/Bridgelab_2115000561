import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Author{
    String name();
}
@Author(name="John Doe")
class Book{}

public class AnnotationRetriever{
    public static void main(String[] args){
        if(Book.class.isAnnotationPresent(Author.class)){
            Author author=Book.class.getAnnotation(Author.class);
            System.out.println("Author Name: "+author.name());
        }
    }
}
