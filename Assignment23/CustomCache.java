import java.util.*;
public class CustomCache {
    private static final Map<Integer, Integer> cache=new HashMap<>();

    @CacheResult
    public static int expensiveMethod(int n){
        if(cache.containsKey(n)){
            return cache.get(n);
        }
        int result=compute(n);
        cache.put(n,result);
        return result;
    }
    private static int compute(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(expensiveMethod(5));
        System.out.println(expensiveMethod(5));
        System.out.println(expensiveMethod(10));
        System.out.println(expensiveMethod(10));
    }
}
