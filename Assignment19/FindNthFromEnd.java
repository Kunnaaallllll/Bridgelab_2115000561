import java.util.*;

public class FindNthFromEnd {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        int n=2;
        System.out.println(findNthFromEnd(list,n));
    }
    public static String findNthFromEnd(LinkedList<String> list,int n){
        var f=list.iterator();
        var s=list.iterator();
        while(n-->0)f.next();
        while(f.hasNext()){
            f.next();
            s.next();
        }
        return s.next();
    }
}
