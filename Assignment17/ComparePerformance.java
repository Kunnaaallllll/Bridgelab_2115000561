import java.util.*;
public class ComparePerformance {
    public static void main(String[] args) {
        int n = 1000000;
        int arr[]=new int[n];
        Random r=new Random();
        for(int i=0;i<n;i++){
            arr[i]=r.nextInt(n);
        }
        int target=arr[r.nextInt(n)];
        long start=System.nanoTime();
        linearSearch(arr,target);
        long end=System.nanoTime();
        System.out.println("for linear time is : "+(end-start)/1e6+" ms");

        Arrays.sort(arr);
        start =System.nanoTime();
        binarySearch(arr,target);
        end=System.nanoTime();
        System.out.println("binary search time is : "+(end-start)/1e6+" ms");
    }
    public static int linearSearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+ (end-start)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
