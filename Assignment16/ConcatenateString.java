import java.util.*;
public class ConcatenateString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuffer stb=new StringBuffer();
        for(int i=0;i<n;i++){
            stb.append(sc.next());
        }
        System.out.println(stb.toString());
    }
}