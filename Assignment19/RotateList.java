import java.util.*;

public class RotateList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int k=2;
        rotateList(list,k);
        System.out.println(list);
    }
    public static void rotateList(List<Integer> list,int k){
        int n=list.size();
        k%=n;
        for(int i=0;i<k;i++){
            list.add(list.remove(0));
        }
    }
}
