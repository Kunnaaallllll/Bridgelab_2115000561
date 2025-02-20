import java.util.*;
public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        int n=5;
        Queue<String> queue=new LinkedList<>();
        queue.add("1");
        while(n>0){
            String s=queue.remove();
            System.out.print(s+" ");
            queue.add(s+"0");
            queue.add(s+"1");
            n--;
        }
    }
}
