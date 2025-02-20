import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(3,1,2,2,3,4));
        removeDuplicates(list);
        System.out.println(list);
    }
    public static void removeDuplicates(List<Integer> list){
        Set<Integer> set=new HashSet<>();
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            int n=it.next();
            if(!set.add(n)){
                it.remove();
            }
        }
    }
}
