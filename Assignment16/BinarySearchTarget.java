import java.util.*;
public class BinarySearchTarget {
    public static void main(String[] args) {
        int arr[]={3, 4, -1, 1};
        int target = 4;
        Arrays.sort(arr);
        System.out.println(findTargetIndex(arr, target));
    }
    public static int findTargetIndex(int arr[], int target){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
}
