import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder stb=new StringBuilder(str);
        stb.reverse();
        System.out.println(stb);
    }
}