import java.util.*;

public class ReplaceMultipleSpaces {
    public static String replaceSpaces(String text) {
        return text.replaceAll("\\s+", " ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Text:");
        String st=sc.nextLine();
        System.out.println(replaceSpaces(st));
    }
}
