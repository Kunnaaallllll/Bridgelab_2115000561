import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> linkedList=new LinkedList<>(Arrays.asList(1,2,3,4,5));
        reverseList(arrayList);
        reverseList(linkedList);
        System.out.println(arrayList);
        System.out.println(linkedList);

    }
    public static void reverseList(List<Integer> list){
        int i=0;
        int j=list.size()-1;
        while(i<j){
            int temp=list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
}